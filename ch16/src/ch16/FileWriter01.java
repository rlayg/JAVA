package ch16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하시오");
		String msg = sc.nextLine();
		FileWriter fw = new FileWriter(fileName);
//		현재 날짜
		Date date = new Date();
		fw.write(date + " : " + msg);
		fw.close(); //반드시 해야 함
		System.out.println("출력 끝");
		sc.close();
	}
/*
  출력할 파일명
kkk.txt
저장할 글을 입력하시오
손흥민 부활포
출력 끝
------------이러면 만들어짐 어디에?
C:\Java programming\Sources\ch16
여기에
-------------- fw.close(); //반드시 해야 함 ----
이걸 안한다면?
껍데기만 만들어지고 내용물이 안만들어져
 */
}
