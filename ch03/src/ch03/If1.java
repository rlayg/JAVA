package ch03;

public class If1 {

	public static void main(String[] args) {
		int a = -12;
		int b = 100;
		int c = a + b;
		
		if(a>0) {
			System.out.println(a + "는 양수");
			System.out.println("두줄 이상일때 {}로 감싸주");
		} else {
			System.out.println(a + "는 음수");
			System.out.println("두줄 이상일때 {}로 감싸주");
		}
		
		
//		if(a>0) System.out.println(a + "는 양수");
//		else    System.out.println(a + "는 음수");
//		한줄일때는 이렇게 해도 된다
		
		System.out.println("c => " + c);
		System.out.println("프로그램 종료");
	}

}
