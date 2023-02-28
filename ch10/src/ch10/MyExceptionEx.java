package ch10;

import java.util.Scanner;

public class MyExceptionEx {

	public static void main(String[] args) {
		int kkk = 0;
//		1. 객체선언
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 주사위 숫자 입력?");
		
		try {
			kkk = sc.nextInt();	
			if(kkk > 6 || kkk <1) throw new MyException();
			System.out.println("정상출력");
		} catch (MyException e) {
			System.out.println("MyException --> " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception --> " + e.getMessage());
		}
		
	}

}
