package ch10;

public class MyException extends Exception {
	
	@Override
	public String getMessage() {
		String errMsg;
		
		errMsg = "아니 6보다 크다니";
				
		return errMsg;
	}
}
