package ch06;

class Encapsule {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			System.out.println("나이입력오류 ㅎㅎ");
		else
			this.age = age;
	}

}

public class EncapsuleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsule encapsule1 = new Encapsule();
		encapsule1.setName("홍길동");
		encapsule1.setAge(-39);

		System.out.println("이름: " + encapsule1.getName());
		System.out.println("나이: " + encapsule1.getAge());

	}

}
