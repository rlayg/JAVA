package ch04;

public class ArrCopy {
//	이걸 사용하면 배열도 조작이 좀 가능하다 그래도 어레이리스트보다는 불편하다
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int [10];
		System.out.println(b);
		
		System.out.println("---------1---------");
//		        Copy대상Array Index Copy목적지Array Index 복사할양
		System.arraycopy(a, 0, b, 0, a.length);
		pr(a);
		pr(b);
		cls(b);
		pr(b);
		
		System.out.println("---------2---------");
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		cls(b);
		
		System.out.println("---------3---------");
		System.arraycopy(a, 1, b, 0, a.length-1);
		pr(b);
		cls(b);
		
		System.out.println("---------4---------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b);
	}
	
	public static void pr(int[] b) {
		for (int i = 0; i < b.length ; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
	}
	
//	모든 원소 0으로 초기화
	public static void cls(int[] arr) { // cls(b) 의 주소값이 가는거 call By Reference 주소값을 넘겨주는 거니까
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

}
