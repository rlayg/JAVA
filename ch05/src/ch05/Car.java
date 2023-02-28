package ch05;
//설계도
public class Car {
	String color;	//Member변수, 필드
	int    speed;
	
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
	}
}
