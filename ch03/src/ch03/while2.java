package ch03;

import java.io.IOException;

public class while2 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
		//시스템 키보드 값 읽어들임
		int num = System.in.read() - '0';
		int i = 1;
		
		System.out.println("num -> " + num);
		if(num >= 2 && num <= 20) {
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;
			}
		} else {
			System.out.println("구구단에 없는 숫자입니다.");
		}
	}

}
