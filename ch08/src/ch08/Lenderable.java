package ch08;

public interface Lenderable {
	//상태값 표시(상수)
	int BORROW = 1; //빌려간 상태
	int NORMAL = 0; //대여 가능 상태
	void checkOut(String borrower, String date);
	void checkin(); // abstract void checkin(); 도 맞는데 abstract 잘 안써
	
}

class SeperateVolume implements Lenderable{

	String title;	 	//초기 생성시 값 입력 --> 젊은 베르테르 슬픔
	String date; 		// 2023/01/30
	String borrower; 	//정승환/박윤하
	int    status;	    //상태값 0
	
	//constructor
	public SeperateVolume(String title){
		this.title = title;
	}
	
	//책 대여
	@Override
	public void checkOut(String borrower, String date) {
		if(status != NORMAL) {
			System.out.println("이미 대여된 도서입니다.");
			return;
		}
		this.date = date;
		this.borrower = borrower;
		status = BORROW;
		// status = 1; 안됨
		System.out.println(borrower + "가 " + date + "일에 " 
		+ title + "을 대여했다" );
	}

	//책 반환
	@Override
	public void checkin() {
		if(status != BORROW) {
			System.out.println("이미 반납된 도서입니다.");
			return;
		}
		System.out.println(borrower + "가 " + title + "을 반납했다");
		date = null;
		borrower = null;
		status = NORMAL; //0

	}
	
}