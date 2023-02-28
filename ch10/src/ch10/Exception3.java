package ch10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception3 {

	public static void main(String[] args) {
		int kkk = 0;
		float fVar = (float) 22.31;
		String kStr = "문자열";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println();
			
			int num1;
			try {
				//출력 후 라인 바뀌지 않음
				System.out.print("첫 번째 값을 입력하세요 => ");
				num1 = Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				//출력 후 라인 바꿈
				System.out.println(num1 + " / " + num2 + " = " + num1/num2);
				//출력 후 라인 바꿈
				System.out.printf("1.printf --> %d / %d = %d", num1, num2, num1/num2);
				System.out.println();
				System.out.printf("2.printf --> 문자 : %s 소수점: %f", kStr, fVar);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력햐야 합니다");
			} catch(ArithmeticException e) {
				System.out.println("0으로 나누면 안돼요");
			} catch (Exception e) {
				System.out.println("전체 오류");
			}
		}
	}
}
