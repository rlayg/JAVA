package ch05;

class OverLoading{
	String name;
	int age;
	String gender;
	
	//생성자 OverLoading
	OverLoading(){
		
	}
	OverLoading(int a){
		age = a;
	}
	OverLoading(String str){
		name = str;
	}
	OverLoading(String str, int age){
		name = str;
		this.age = age;
	}
	void print() {
		System.out.println("------------------");
		System.out.println("name->" + name);
		System.out.println("age->" + age);
	}
}

public class OverLoadingEx {

	public static void main(String[] args) {

		OverLoading ov1 = new OverLoading();
		OverLoading ov2 = new OverLoading(25);
		OverLoading ov3 = new OverLoading("홍길동");
		OverLoading ov4 = new OverLoading("양만춘", 35);
		ov1.print();
		ov2.print();
		ov3.print();
		ov4.print();
		
	}

}
