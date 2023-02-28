package ch03;

import java.util.Scanner;

public class Do5 {
//		숫자 맞추기 게임
	public static void main(String[] args) {
//		1. 객체선언
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, num;
		int answer = (int)(Math.random()*100) + 1; //1~100점수
		do {
		System.out.println("1~100 중 어떤 숫자일까요?");
//		num = sc.nextInt();
//		2. 관련 method 사용
		num = sc.nextInt();
		if(answer == num) {
			System.out.println(cnt + "번에 맞췃습니다 축하!");
			break;
		} else if(answer > num) {
			System.out.println("더 큰수를 입력하세요");
		} else System.out.println("작은수를 입력하세요");
		cnt++;
			
		} while (true);
		sc.close(); 
//		요런거 있으면 무조건 닫아줘 pc는 상관없는데 서버에서라면 계속 쓰레기(가비지) 남아있어
//		가비지코렉터가 있어도 다 안지우고 리소스 남아있으면 언젠가 서버가 죽어
//		서버에 메모리에 계속 누적돼
	}

}
