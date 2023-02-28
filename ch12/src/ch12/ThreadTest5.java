package ch12;

import javax.swing.JOptionPane;
//	번호 끝나기전에 이름 쓰기 게임
class TreadExample6 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch ( Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class ThreadTest5 {

	public static void main(String[] args) {
		TreadExample6 te6 = new TreadExample6();
		te6.start();
		
		String name = JOptionPane.showInputDialog("너 이름이 뭐니?");
		System.out.println("당신의 이름은 " + name + "입니다");
	}

}
