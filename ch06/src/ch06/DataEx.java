package ch06;

//***
class Data{
	int kor;
	int eng;
	int math;
	
	//call by reference 참조에 의한 호출
	void addRed(Data d1, Data d2) {
		d1.kor = d2.eng;
		System.out.println("call by reference addRed Method 국어 점수: " 
		+ d1.kor);
	}
	
	//call by value 값에 의한 호출
	void addValue(int kor, int eng) {
		kor = eng;
		System.out.println("call by value addValue Method 국어 점수: " 
		+ kor);
	
	}
}
public class DataEx {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		
		d3.addRed(d1, d2); // Instance를 넘겨주면 주소값을 넘겨주는 효과
		System.out.println("Main 국어 점수 : " + d1.kor);
		//넘겨주는것이 객체, 배열, String 이면 콜 바이 레퍼런스
	
		d3.addValue(80, 70); //Value를 넘겨줌
		System.out.println("Main 국어 점수 : " + d3.kor);
		//primitive(원시) -> int, float, double 콜 바이 밸류로 넘어가 	
	}

}
