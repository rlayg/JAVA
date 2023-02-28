package ch11;

public class Car {
	void print() {
		System.out.println("난 차야");
	}

}

class Bus extends Car{
	void print() {
		System.out.println("난 Bus야");
	}
	void move() {
		System.out.println("승객 50명이야");
	}
}
class Taxi extends Car{
	void print() {
		System.out.println("난 Taxi야");
	}
}
