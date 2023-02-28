package ch03;

public class For01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			// sum = sum + i
			sum += i; // sum = 0+1+2+...+10
			System.out.println(i + "까지 합: " + sum);
		}
	}

}
