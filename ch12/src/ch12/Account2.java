package ch12;

// Bank --> 간단한 잔액 관리
public class Account2 {
	int total; //잔액
	
	
	
	public Account2(int total) {
		this.total = total;
	
	}
	//예금
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(name + " 예금 : " + amt );
	}
	//인출
	void withdraw(int amt, String name) {
		if(amt <= total) {
			total -= amt;
			System.out.println(name + " 출금 " + amt);
			getTotal();
		} else {
			System.out.println(name + "의 출금 요청 " + amt
					+ " 잔액부족 저금좀 해 --> 현재 잔액: " + total);
		}
	}
	//잔액 조회
	void getTotal() {
		System.out.println("잔액 : " + total);
	}

}
