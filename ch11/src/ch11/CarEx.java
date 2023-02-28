package ch11;

import java.util.ArrayList;

public class CarEx {
//	java.lang.module.FindException: Module ch16 not found 이 예외가 발생하는 이유는 ch16에서 드러그해와서 그럼 알 필요도 없고 지워도 상관없음
	public static void main(String[] args) {
//		제네릭 <>에는 부모 혹은 제일 큰걸로 받아야해
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		for(Car c : al) {
			c.print();
//			3. 과제 move 출력하기
			if(c instanceof Bus) {
				((Bus)c).move();
//				아래 두줄이 위 한줄과 같은거다
//				Bus b = (Bus) c;
//				b.move();
				
//			if(c instanceof Bus) {
//				Bus bs = (Bus) c;
//				bs.move();
//			((Bus)c).move();
				
			}
		}
	}

}
