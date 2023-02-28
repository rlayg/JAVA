package ch11;

import java.util.Vector;

public class Vextor2Ex {
	
	public static void print(Vector<String> vc) {
		for(String str : vc) {
			System.out.print(str + "\t");
		}
		System.out.println("\n==============");
	}
	
	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();
		vc.add("수박");
		vc.add("고추");
		vc.add("수박");
		vc.add("대추");
		vc.add("오이");
		System.out.println("갯수 : " + vc.size());
		print(vc);
		
//		2번 자리에 끼워 넣기 가능
		vc.add(2, "키위");
		print(vc);
		vc.set(3, "참와");
		print(vc);
		vc.remove(1);
		print(vc);
		System.out.println("2번 인덱스 --> " + vc.get(2));
		System.out.println("수박 문의(포함여부) : " + vc.contains("수박"));
		System.out.println("수박 문의(Index) : " + vc.indexOf("수박"));
		System.out.println("수박 문의 : " + vc.lastIndexOf("수박"));
	}

}
