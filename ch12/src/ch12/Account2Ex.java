package ch12;

class Account2User extends Thread {
	
	Account2 account2;
	boolean flag;
//	String name;
/*
 * 난 Thread에 super(name); 있는줄 모르니까 this.name = name; 쓰려하면 어캐하냐
 * String name; this.name = name; 하고 run()의 getName()을 this.name 혹은 name으로 바꿔
 */
	
	public Account2User(Account2 account2, String name) {
		super(name);
//		this.name = name;
		this.account2 = account2;
	}
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (account2) {
				if(flag)  account2.deposit((int)(Math.random()*10000), getName());
				else account2.withdraw((int)(Math.random()*10000), getName());
				flag = !flag; //flag Swap
			}
		}
	}
}

public class Account2Ex {

	public static void main(String[] args) {
		Account2 act1 = new Account2(10000); // 여자그룹 계좌 
		Account2 act2 = new Account2(15000); // 남자그룹 계좌 
		
//		여자그룹(옥주현, 조정은, 정선아) / 남자그룹(김준수, 전동석, 싱성록)
		Account2User au1 = new Account2User(act1, "옥주현");
		Account2User au2 = new Account2User(act1, "조정은");
		Account2User au3 = new Account2User(act1, "정선아");
		Account2User au4 = new Account2User(act2, "김준수");
		Account2User au5 = new Account2User(act2, "전동석");
		Account2User au6 = new Account2User(act2, "신성록");

		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
	}

}
