package ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름은?");
		String name = bufferedReader.readLine();
		System.out.println("주소는?");
		String addr = bufferedReader.readLine();
		System.out.println(name + "님은 " + addr + "에 사시는군요");
	}
}
