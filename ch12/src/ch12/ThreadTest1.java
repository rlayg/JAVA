package ch12;

class TreadExample1 extends Thread{
	
	public TreadExample1(String str) {
		super(str);
	}
	@Override
	public void run() {
		//super.run
		for(int i = 1; i <= 100; i++) {
			System.out.print(getName() + i + "\t");
			if(i%10==0) System.out.println(); // 나머지가 10이면 한줄 내린다
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
		super.run();
	}
	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		
		TreadExample1 a1 = new TreadExample1("subThreadA");
		TreadExample1 a2 = new TreadExample1("subTrreadB");
		
		a1.start();
		a2.start();
//		a1.run();
//		a2.run();
		
		for(int i = 1; i<=100; i++) {
			System.out.print("Main " + i + "\t");
			if(i%10 == 0) System.out.println();
		}
		
	}

}
