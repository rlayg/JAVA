package ch06;

public class PersonEx {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setName("수지");
		st1.setAge(21);
		st1.setSno("1234");
//		st1.printAll();
		
		Teacher th1 = new Teacher();
		th1.setName("길동");
		th1.setAge(35);
		th1.setSubject("Java");
		
		Manager mg1 = new Manager();
		mg1.setName("원빈");
		mg1.setAge(19);
		mg1.setPart("청소");
		
//		그냥 name이 안되는 이유: 인캡슐레이션 캡슐화 정보보호 게터써야함
//		System.out.println("이름: " + name
//		+ " , 나이: " + st1.getAge() 
//		+ " , 학번: " + st1.getSno());

		System.out.println("이름: " + st1.getName() 
				+ " , 나이: " + st1.getAge() 
				+ " , 학번: " + st1.getSno());
		
		st1.printAll();
//		th1.printAll();
//		mg1.printAll();
		
	}

}
