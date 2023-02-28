package ch06;
//자원 절감
class SingleTon{
	String str;
	private static SingleTon instance;
	//아무나 나를 생성하지 못함
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		if(instance == null) instance = new SingleTon();
		return instance;
	}
}

public class SingleTonEx {

	public static void main(String[] args) {
		SingleTon st1 = SingleTon.getInstance();
//		SingleTon st2 = new SingleTon();
		SingleTon st2 = SingleTon.getInstance();
		
		st1.str = "스스로 있는자";
		
		System.out.println(st2.str);
		if(st1 == st2) System.out.println("같다");
		else           System.out.println("다르다");
		
	}

}
