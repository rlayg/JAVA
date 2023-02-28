package ch05;

class Car1 {
	String color;//Member변수, 필드
	int    speed;
	
	static int wheel;
	//static *** 동일 클래스 내의 모든 인스턴스들이 공유하는 변수 -> 클래스변수
	
	void speedUp() {
		speed++;
		System.out.println(speed + "속도를 올렸다.");
	}
	void speedDown() {
		speed--;
		System.out.println(speed + "속도를 내렸다.");
	}
	void print() {
		System.out.println("색깔: " + color);
		System.out.println("속도: " + speed);
		System.out.println("바퀴: " + wheel);
	}
}

public class Car1Ex {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.color = "빨강";
		c1.speed = 200;
//		c1.wheel = 4;
		c2.color = "노랑";
//		c2.wheel = 3;
		//wheel은 스태틱 변수라 바꾸면 클래스 내 모든 휠이 바뀜 위에서 4 했다가 밑에서 3 하면 모든 휠은 3으로 됨
		c1.print();
		c2.print();
	}

}
