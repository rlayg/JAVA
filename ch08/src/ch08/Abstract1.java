package ch08;

abstract class AbsClass{
	int kkk = 0;
	public void setkkk(int kkk) {
		this.kkk = kkk;
	}
	//생성자
	public AbsClass() {
		System.out.println("추상Class 생성자");
	}
	//하나 이상의 추상 메소드가 존재 해야 함
	abstract void print();
}

class ImplAbsClass extends AbsClass{

	@Override
	void print() {
		System.out.println("ImplAbsClass kkk --> " + kkk);
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// 추상 Class는 instance 생성 안됨
		//AbsClass absClass3 = new AbsClass();
		
		AbsClass absClass3 = new ImplAbsClass();
		absClass3.setkkk(12);
		absClass3.print();
	}

}
