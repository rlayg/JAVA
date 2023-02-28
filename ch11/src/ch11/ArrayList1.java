package ch11;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
//		1. ArrayList 선언
		ArrayList<String> al = new ArrayList<>();
//		2. ArrayList 원소 입력
		al.add("고양이");
		al.add("길양이");
		al.add("강아지");
		al.add("진도개");
		al.add("고양이");
		
//		al0 -> 고양이
//		al1 -> 길양이
//		al2 -> 강아지
//		al3 -> 진도개
//		al4 -> 고양이
		
//		3. ArrayList 사이즈 측정
		System.out.println("al size -> " + al.size());
		System.out.println();
		
//		4. ArrayList 원소 조회
		for(int i = 0; i < al.size(); i++) {
			System.out.println("al" + i + " -> " + al.get(i));
		}
		System.out.println("===향상형===");
		for(String str : al) {
			System.out.println("al str -> " + str);
		}
		
//		int kkk = 0;
//		for(String str : al) {
//			System.out.println("al" + kkk + " str ->" + str);
//			kkk++;
//		}
//		원래 for문처럼 al0~al4 숫자 보고싶으면 억지로 넣은거
	}

}
