package ch10;

public class MyException2 extends Exception {
	@Override
	public String getMessage() {
		String errMsg = "";
		
		errMsg = "사냥님 1000만원 너무 많아요";
		
		return errMsg;
	}
}
