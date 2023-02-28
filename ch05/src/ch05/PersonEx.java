package ch05;

class Person{
	String name;
	int age;
	String gender;
	
	void print() {
		System.out.println("이름: " + name 
				+ " 나이: " + age + "성별: " + gender);
	}
}


public class PersonEx {

	public static void main(String[] args) {
		// Person Instance -> per1, per2, per3
		Person per1 = new Person();
		Person per2 = new Person();
		Person per3 = new Person();

		per1.name = "홍 길동";
		per1.age = 22;
		per1.gender = "M";
		
		per2.name = "연개소문";
		per2.age = 32;
		per2.gender = "M";

		per3.name = "선덕여왕";
		per3.age = 42;
		per3.gender = "F";
		
		per1.print();
		per2.print();
		per3.print();
	}

}
