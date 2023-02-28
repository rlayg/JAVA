package ch04;

public class Arr02 {

	public static void main(String[] args) {
		int[] a = new int[] {23, 45, 67, 789, 2};
		System.out.println("------일반 For문-----");
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("----향상형 For문-----");
		for(int b : a) {
//			count ++;
			System.out.println("향상b = " + b);
			
		
		}
		
	}

}
