package ch07;

//부모 rv = new 자식(); up casting OK
//rv(인스턴스 rv는 아무 의미 없어 그냥 넣은거)
//부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
//부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
//
//자식 rv2 = new 부모(); down casting X
//자식 rv3 = (자식)부모객체;  down casting
//강제 형변환 하면 
//1) 문법적 에러가 없음 
//2) (실행했을 때)에러가 있을 때도 없을 때도 있다

public class Person2Ex {

	public static void main(String[] args) {
		Person2[] ps = new Person2[5];
		ps[0] = new Student2("옥주현", 23, "1203667");
		ps[1] = new Student2("김유신", 53, "1386889");
		ps[2] = new Teacher2("대조영", 48, "Java");
		
		ps[3] = new Manager2("조정은", 28, "뮤지컬");
		ps[4] = new Manager2("김준수", 40, "MC");
		
		for(Person2 p : ps) {
			p.print();
//			p가 Manager2의 인스턴스형이냐
//			p가 부모고 Manager2가 자식
			if(p instanceof Manager2) {
				Manager2 m2 = (Manager2) p;
				System.out.println("추가: " + m2.getPart());
			}
		}
	}
}



