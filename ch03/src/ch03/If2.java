package ch03;

public class If2 {

	public static void main(String[] args) {
//		String sStr1 = args[0];
//		String sStr2 = args[1];
//		
//		System.out.println("args[0] = " + sStr1 );
//		System.out.println("args[1] = " + sStr2 );
		
		//얘는 그냥 실행하면 안돼 위의 run -> run configurations -> argument값 채우기

		
		//숫자옆에 우클릭 - toggle breakpoint - debug  디버그 - step over(변화 알아보기)
			
//		주석처리 후 밑에거 시작
		
		int a = Integer.parseInt(args[0]);
		
		if(a>0) {
			System.out.println(a + "는 양수");
		} else {
			System.out.println(a + "는 음수");
		}
		System.out.println("프로그램 종료");
	}
}
