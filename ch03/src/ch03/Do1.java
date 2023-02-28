package ch03;

public class Do1 {

	public static void main(String[] args) {
/*
 * Do-while 문 고수들은 while보다 do-while 잘 쓴데
 * 이유는 while문은 while 만났을때 예외나면 바로 끝내는데
 * 얘는 일단 do문 실행 시키고 while 마지막에 있어서 안되도 위에거는 나오니까
 */
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
			System.out.println("합계: " + i + " -> " + sum);
		} while (i <= 10);

	}

}
