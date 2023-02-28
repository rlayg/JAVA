package ch02;

public class VariableExample {
	public static void main(String[] args) {
		//int라는 자료형을 가진 intValue라는 변수에 10을 저장해라
		int intValue = 10;
		//세미콜론은 약속
		int computeValue = 0;
		
		System.out.printf("intValue -> %d\n", intValue);
		System.out.printf("1.computeValue -> %d\n", computeValue);
		
		computeValue = intValue + 50;
		System.out.printf("2.computeValue -> %d\n", computeValue);
	}
}
