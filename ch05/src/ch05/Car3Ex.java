package ch05;

public class Car3Ex {

	public static void main(String[] args) {
		Car3 c1 = new Car3("소나타", 10, 14);
		Car3 c2 = new Car3("그렌저", 9, 20);
		Car3 c3 = new Car3("아반테", 12, 13);
		//final
//		c1.AMPERTIME = 2500;
		
		c1.print();
		c2.print();
		c3.print();
		
	}

}
