package ch11;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx2 {
//			로또 2개 만든거 
	public static void main(String[] args) {
		Integer kkk = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수");
		int num1 = sc.nextInt();
		System.out.println("두번째 수");
		int num2 = sc.nextInt();
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(num1);
		hs.add(num2);
		
		while(true) {
			int num = (int)(Math.random()*45) + 1;
			System.out.println("num -> " + num);
			hs.add(num);
			if(hs.size() == 6)
				break;
		}
		System.out.println(hs);
		sc.close();
		
	}

}
