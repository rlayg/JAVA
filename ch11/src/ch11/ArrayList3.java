package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		System.out.println("요소의 개수-> " + list.size());
		System.out.println(">> Iterator 객체로 요소 얻기 <<");
//		** 중요
		/*
		사과	바나나	귤	오렌지	바나나 를 elements 가지고 있고
		hasnext(있냐?) 하면 다음거 가져오고
		next
		다시 hasNext 있냐?
		next - 가져와라
		...
		*/
		Iterator elements = list.iterator();
//		요소가 있다면
		while(elements.hasNext()) {
//			요소를 얻어내어 출력
			System.out.print(elements.next() + "\t");
		}
		System.out.println("\n");
		
		System.out.println(">> get 메소드로 요소 얻기 <<");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

}
