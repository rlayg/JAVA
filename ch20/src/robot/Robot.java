package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot {
	
	//연관관계로 쓸거 멤버변수로 선언하면 된대
	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	//Robot 생성자
	public Robot() {
	}
	
	// Robot 형태 구성
	public abstract void shape();

	public void actionBasic() {
		System.out.println("팔, 다리, 머리, 몸통 존재.");
	}
	
	//비행 기능
	public void actionFly() {
		flyAction.fly();
	}
	
	// 미사일 기능
	public void actionFire() {
		fireAction.fire();
	}
	
	//칼 기능
	public void actionKnife() {
		knifeAction.knife();
	}
}
