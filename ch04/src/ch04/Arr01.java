package ch04;

public class Arr01 {

	public static void main(String[] args) {
//		크기가 5인 배열 a 생성
		int[] a = new int[5];
		a[0] = 75;
		a[1] = 12;
		a[2] = 23;
		a[3] = 45;
		a[4] = 53;
		
//		size측정 --> .length
		System.out.println("a.length -> " + a.length);
		for(int i = 0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("================");
		int[] b = new int[5];
		b[0] = 12;
		b[1] = 23;
		b[2] = 54;
		b[3] = 47;
		b[4] = 76;
		for(int i = 0; i<b.length; i++) {
			System.out.printf("b[%d] = %d\n", i,  b[i]);
		}
	}

}
