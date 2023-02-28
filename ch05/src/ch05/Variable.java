package ch05;

class Var{
	//class 변수
	static int k;
	
	//Instance 변수
	String color = "멋있어"; // Member 변수 , 필드
	int speed = 33;
	
	void scope() {
		//지역변수
		int s = 77;
		System.out.println(s + "scope method");
	}
}
public class Variable {

	public static void main(String[] args) {
		Var.k = 10;
		Var var1 = new Var();
		var1.speed = 55;
		System.out.println("k-> " + var1.k);
		System.out.println("speed-> " + var1.speed);
		var1.scope();
//		System.out.println("scope.s->" + var1.s);
		
	}

}
