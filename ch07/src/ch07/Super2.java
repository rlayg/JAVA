package ch07;

class Parent1{ //생성자 2개 가지고 있다 -> 생성자 오버로딩
	Parent1(){
		System.out.println("매개변수 없는 부모 생성자");
	}
	Parent1(String str){
		System.out.println("Parent 매개변수 있는 부모 생성자 1 str --> " + str);
	}
	void parentPrint() {
		System.out.println("parentPrint 야호! 월요일이다");
	}
}

class Child1 extends Parent1{
	Child1(){
		super("헐~~"); // 매개변수 1개 짜리 부모 생성자 호출
		System.out.println("매개변수 없는 자식 생성자");
		//super("헐~~"); // 매개변수 1개 짜리 부모 생성자 호출 --> 오류
	}
	void childCc1() {
		System.out.println("cc1 야호! 월요일이다");
	}
	void childCc2() {
		System.out.println("cc2 자식 Method cc2");
	}
	void parentPrint() {
		System.out.println("Overriding parentPrint 야호! 월요일이다");
	}
}
public class Super2 {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.childCc2();
		child1.childCc1();
		child1.parentPrint();
		
	}

}
