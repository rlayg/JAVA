package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {

	public static void main(String[] args) {
		FileReader reader;
		char[] buffer = new char[100];
		String file_name = ".classpath"; //정상
//		String file_name = ".classpathkkk"; //예외만들기
		
		try {
			//given the name of the file to read 파일을 읽기 위한 클라스
			//FileReader에 마우스 올리면 기븐~리드 나오는거 복붙해도 돼
			reader = new FileReader(file_name);
			reader.read(buffer, 0, 100);
			//읽다가 말은 이유: 100바이트까지 읽으라고 했으니까 더 보고싶으면 200까지 높여봐
			String str = new String(buffer);
			System.out.println("읽은건 " + str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없습니다");
		} catch (IOException e) {
			System.out.println("읽다가 에러났습니다");
//			.classpath 파일이 깨지거나 오류났을때 나오는 예외
		} finally {
			System.out.println("어쨋거나 읽었습니다");
		}
	}

}
