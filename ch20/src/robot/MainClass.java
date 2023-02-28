package robot;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("========SuperRobot 주문 =====");
		Robot superRobot = new SuperRobot();
		superRobot.actionBasic();
		superRobot.shape();
		superRobot.actionFly();
		superRobot.actionFire();
		superRobot.actionKnife();
		
		System.out.println("===================");
		System.out.println("========StandardRobot 주문 =====");
		Robot standardRobot = new StandardRobot();
		standardRobot.actionBasic();
		standardRobot.shape();
		standardRobot.actionFly();
		standardRobot.actionFire();
		standardRobot.actionKnife();
		
		System.out.println("===================");
		System.out.println("========CheapRobot 주문 =====");
		Robot cheapRobot = new CheapRobot();
		cheapRobot.actionBasic();
		cheapRobot.shape();
		cheapRobot.actionFly();
		cheapRobot.actionFire();
		cheapRobot.actionKnife();
		
	}

}
