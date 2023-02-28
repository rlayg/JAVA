package ch05;

public class CarEx {

	public static void main(String[] args) {
		//선언             생성
		Car myCar = new Car();
		myCar.color = "빨강";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.print();
		
		//선언             생성

		Car yourCar;
		yourCar = new Car(); //생성
		myCar.color = "초록";
		myCar.speed = 150;
		myCar.print();
		myCar.speedDown();

		
	}

}
