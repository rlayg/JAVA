package ch07;

class Parent{
	int a = 7;
	int b = 7;
	void display() {
		System.out.println("Parent 대박 ");
	}
	void print() {
		System.out.println("Parent 난 부모 print 메소드");
	}
}

class Child extends Parent{
	int a = 10;
	void print() {
		super.print(); //1 부모 Method 찾는다
		System.out.println("Child 부모멤버       a = " + super.a);
		System.out.println("Child 난 자식 메소드  a = " + a); //This가 생략된것으로 본다 This.a 로 해도 된다
		System.out.println("Child 난 자식 메소드  b = " + b);
		System.out.println("===================");
	}
}
public class Super1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.print();
		child.display();
	}

}
