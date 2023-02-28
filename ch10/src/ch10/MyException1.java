package ch10;

public class MyException1 extends Exception {

	@Override
	public String getMessage() {
		String errMsg = "";
		
		errMsg = "사냥님 180만원 보다 적어요!! 이게 뭡니까";
		
		return errMsg;
	}
	
	
}
