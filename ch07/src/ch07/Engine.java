package ch07;

public class Engine {
	String type; //타입
	int cc; //배기량
	
	//생성자
	Engine(String type, int cc){
		this.type = type;
		this.cc = cc;
	}
	
	//일반 메소드
	void print() {
		System.out.println("타입 " + type);
		System.out.println("배기량 " + cc);
	}

}
