package robot;

import robot.actions.FireNo;
import robot.actions.FlyNo;
import robot.actions.KnifeOk;

public class CheapRobot extends Robot {

	public CheapRobot() {
		flyAction = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeOk();
	}
	
	@Override
	public void shape() {
		System.out.println("걸을 수 있다");
	}

}
