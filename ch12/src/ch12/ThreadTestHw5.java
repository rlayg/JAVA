package ch12;

//Thread 상속 --> System.out.print("-"); 20번 수행
class G1 extends Thread {
	public void run(){
		for(int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

//Runnable 구현 --> System.out.print("+"); 20번 수행
class G2 implements Runnable{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}

//Runnable 구현 --> System.out.print("*"); 20번 수행
class G3 implements Runnable{
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public class ThreadTestHw5 {

	public static void main(String[] args) {
//		각각 Thread 수행 g1,    g2, g3  -->th1, th2
		G1 g1 = new G1();
		G2 g2 = new G2();
		G3 g3 = new G3();
		
		Thread th1 = new Thread(g2);
		Thread th2 = new Thread(g3);
		
		g1.start();
		th1.start();
		th2.start();
		
//		g1.run();
//		th1.run();
//		th2.run();
		
	}

}
