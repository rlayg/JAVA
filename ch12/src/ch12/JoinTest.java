package ch12;

import java.util.ArrayList;

class Before extends Thread{
	public Before(String str) {
		super(str);//아버지가 스레드명을 만들어준다
	}
	void addCar() {
		System.out.println("addCar");
		JoinTest.carList.add("벤츠");
		JoinTest.carList.add("아우디");
		JoinTest.carList.add("SM7");
		JoinTest.carList.add("포르쉐");
	}
	@Override
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		addCar();
	}
}

class After extends Thread{
	public After(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		System.out.println("After Thread 이름: " + getName());
		for(String car : JoinTest.carList) {
			System.out.println(car);
		}
	}
}

public class JoinTest {
	//Class 변수
	public static ArrayList<String> carList = new ArrayList<>();
	
	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중에");
		bf.start();
		
		try {
			bf.join(); // Before가 끝날때까지 기다린다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		af.start();
		
		try {
			Thread.sleep(1000);
			System.out.println("static carList = " + carList);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
