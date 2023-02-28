package ch03;

public class While1 {

	public static void main(String[] args) {
		// For01 --> while 전환
		int sum = 0, i = 1;
		while(i <= 10) {
			sum+=i; //0 + 1 + 2 + ... + 10
			System.out.println(i + "까지 합: " + sum);
			i++;
		}
		

	}

}
