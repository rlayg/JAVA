package ch03;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		
//		int num = System.in.read();
//		System.out.println("num -> " + num); //이거는 아스키코드값을 돌려주네
		
		int num = System.in.read() - '0'; //아스키코드 고유숫자 뒤에 '0'을 빼면 고유 아라비아숫자를 돌려준다
//		선택한 구구단이 나올 수 있도록 For문 구현
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " +i+ " = " + num*i);
			
		}
		
		
	}

}
