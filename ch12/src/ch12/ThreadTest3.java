package ch12;
	
class TreadExample2 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 20 ; i++) {
			System.out.print("대박" + i + " \t");
			if(i%5==0) System.out.println();
			try {
				sleep(50);
			} catch ( InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
}

class TreadExample3 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 20 ; i++) {
			System.out.print("월요일" + i + " \t");
			if(i%5==0) System.out.println();
			try {
				sleep(100);
			} catch ( InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest3 {

	public static void main(String[] args) {
		TreadExample2 te2 = new TreadExample2();
		TreadExample3 te3 = new TreadExample3();
		te2.start();
		te3.start();
		
	}

}
