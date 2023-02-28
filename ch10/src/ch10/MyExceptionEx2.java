package ch10;

public class MyExceptionEx2 extends Exception {

	public static void main(String[] args) {

		int kkk = 0;
		
		try {
			// kkk로 args 넣어준 급여 가져욤 
			kkk = Integer.parseInt(args[0]);
			//2. kkk<180 -> 마이익셉션1
			if(kkk < 180) throw new MyException1();
			//3. kkk<1000 -> 마이익셉션2
			if(kkk > 1000) throw new MyException2();
			System.out.println("정상급여");
			
			//Parameter 오류
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
			System.out.println("[실행 방법]");
			System.out.println("Java MyExceptionEx2 num1");
			//최저임금오류
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
