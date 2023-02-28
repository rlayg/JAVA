package ch08;

public class LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("젊은 베르테르의 슬픔");
		sv.checkOut("정승환/박윤하", "2023/01/30"); //책 대여
		sv.checkin(); //책 반남
		sv.checkOut("홍길동이", "2024/01/30"); //책 대여
		sv.checkOut("고길동이", "2024/01/30"); //책 대여
	}

}
