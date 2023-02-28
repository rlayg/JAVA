package ch03;

public class If4 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		//문자열 선언
		//중첩된 if
		String grade = "";
		if(score > 90) {
			if(score >= 97) {
				grade = "A+";
			} else if(score < 94) {
				grade = "A-";
			} else {
				grade = "A0";
			}
		} else if(score >= 80) {
			if(score >= 87) {
				grade = "B+";
			} else if(score < 84) {
				grade = "B-";
			} else {
				grade = "B0";
			}
		} else if(score >= 70) {
			if(score >= 77) {
				grade = "C+";
			} else if(score < 74) {
				grade = "C-";
			} else {
				grade = "C0";
			}
		} else grade = "권총";
		
		System.out.println("당신점수는 " + score + "이고 학점은"
				+ grade + "입니다");
	}

}
