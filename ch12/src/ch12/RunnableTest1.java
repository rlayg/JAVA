package ch12;

import java.io.IOException;
import java.nio.CharBuffer;

class Ra1 implements Runnable{
	
	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + "대박" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch ( InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}

	
}

class Ra2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println(i + "월요일" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
//				e.printStackTrace();
			}
		}
	}
	
}

public class RunnableTest1 {

	public static void main(String[] args) {
		Ra1 runnable1 = new Ra1();
		Ra2 runnable2 = new Ra2();
		
// implement 한 것은 반드시 아래와 같은 선언후 사용  --> Thread th1 = new thread(r1) //약속이다
		Thread rThread1 = new Thread(runnable1, "Pr");//생성자 이름을 넣든 말든은 자유 "Pr" 이런거
		Thread rThread2 = new Thread(runnable2, "no");
		
		rThread1.start();
		rThread2.start();
	}

}
