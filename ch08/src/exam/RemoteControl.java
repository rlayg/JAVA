package exam;

public interface RemoteControl {
	//인터페이스는 추상메소드와 상수만 가능하다. 하지만 자바8로 넘어가면서 
	//디폴트메소드와 정적 메소드도 허용한다
	//교재 예제래
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	//정적 메소드
	static void changeBattery(){
		System.out.println("건전지를 교환합니다");
	}
}
