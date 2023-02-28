package ch03;

public class If3 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		//문자열 선언
		String grade = "";
		if(score > 90)	     grade = "A";
		else if(score >= 80) grade = "B";
		else if(score >= 70) grade = "C";
		else grade = "권총";
		
		System.out.println("당신점수는 " + score + "이고 학점은"
				+ grade + "입니다");
	}

}
