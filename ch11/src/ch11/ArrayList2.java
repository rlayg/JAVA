package ch11;

import java.util.ArrayList;

public class ArrayList2 {

	public static void print(ArrayList<String> listPrint) {
		for(String str : listPrint) {
			System.out.print(str + "\t");
		}
		System.out.println("\n----------------------");
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("바나나");
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");

		System.out.println("갯수 : " + list.size());
		print(list);
//		1번 자리에 끼워넣기 가능
		list.add(1, "키위");
		print(list);
//		4번 set 교체
		list.set(4, "복숭아");
		print(list);
//		0번 remove 지우기
		list.remove(0);
		print(list);
//		3번 get 인덱스만 가져오기
		System.out.println("3번 인덱스 --> " + list.get(3));
		System.out.println("수박 문의 : " + list.contains("수박"));
		System.out.println("수박 문의 indexOf : " + list.indexOf("수박"));
		System.out.println("수박 문의 : " + list.lastIndexOf("수박"));
//		과제 (수박 --> 메론 for) 으로 바꿔
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("수박")) {
				list.set(i, "메론");
			}
		}
		print(list);
		
	}

}
