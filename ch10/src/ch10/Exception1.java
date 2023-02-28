package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int kkk = 0;
		float fVar = (float) 22.3111;
		String kStr = "문자열";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println();
			//출력 후 라인 바뀌지 않음
			System.out.print("첫 번째 값을 입력하세요 => ");
			int num1 = Integer.parseInt(in.readLine());
			System.out.print("두 번째 값을 입력하세요 => ");
			int num2 = Integer.parseInt(in.readLine());
			//출력 후 라인 바꿈
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			//출력 후 라인 바꿈
			System.out.printf("1.printf --> %d / %d = %d", num1, num2, num1/num2);
			System.out.println();
			System.out.printf("2.printf --> 문자 : %s 소수점: %.2f", kStr, fVar);
			
		}
	}

}
