package ch03;

public class sw4 {

	public static void main(String[] args) {
		
		String str = args[0];
		int a1 = Integer.parseInt(args[1]);
		int b1 = Integer.parseInt(args[2]);
		
		switch(str) {
			case "+" : 
				System.out.println("덧셈: " + (a1 + b1)); 
				break;
			case "-" : 
				System.out.println("뺄셈: " + (a1 - b1)); 
				break;
			case "X" : System.out.println("곱셈: " + (a1 * b1)); break;
			//"*" 이런 특수기호는 안돼
			case "/" : System.out.println("나눗셈: " + (a1 / b1)); break;
			case "%" : System.out.println("나머지: " + (a1 % b1)); break;
			default  : System.out.println("없는 연산자");
		}
	}

}
