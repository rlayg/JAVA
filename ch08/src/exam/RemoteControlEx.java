package exam;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 1. 선언
		RemoteControl rc1 = null;
		RemoteControl rc2 = null;
		
		// 2. 메모리 할당
		rc1 = new Television();
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(13);
		rc1.setMute(true);
		RemoteControl.changeBattery();
		
		// 3. 메모리 할당
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(13);
		rc2.setMute(true);
		RemoteControl.changeBattery();
	}

}
