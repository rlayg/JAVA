package ch08;
/*
 * 인터페이스는
 * 1) 양식의 역할 (큼) 함 -->표준화
 * 2) 다중상속 지원(극히 일부분..)
 * 3) class 와 class를 연결 해줌(중요)
 */
public class RobotEx {

	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot)r).dance();
//			위와 동일
//			DanceRobot dr = (DanceRobot) r;
//			dr.dance();
		}else if(r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}else {
			//((SingRobot)r).sing();   고수되면 이걸로 써 밑에걸로 연습
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}
	public static void main(String[] args) {
		Robot[] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		//DanceRobot, DrawRobot, SingRobot
		
		for(Robot r : rb) {
			action(r);
		}
	}

}
