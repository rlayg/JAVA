package ch07;

public class Car2Ex {

	public static void main(String[] args) {
		Car2[] cars = new Car2[3];
		//부모객체에 자식 객체 대입 가능
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		
		for(Car2 car : cars) {
			//실행은 부모와 같은 이름의 자식 메소드가 실행
			car.move();
			//멤버변수는 부모것만 적용
			System.out.println("for Car2 --> " + car.a);
			System.out.println("for Car2 --> " + car.a);
			//부모와 다른 메소드 수행하는 방법
			if(car instanceof Ambulance) {//car가 amb로 만들어졋냐
//				Ambulance amb = (Ambulance) car;
//				amb.special();
//				위 아래 동일
//			((Ambulance) car).special();
			
			}
		}
	}
	//같은 이름을 가졌을때 멤버변수는 부모거 메소드는 내거가 실행된다

}
