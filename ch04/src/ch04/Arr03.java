package ch04;

public class Arr03 {

	public static void main(String[] args) {
		
		String[] str = {"코로나", "물가", "손흥민", "국민연금", "우영우"};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
		
		int a = 0;
		for(String st : str) {
			
			System.out.println("st[" + a++ + "] = " + st);
//			a++;
		}
		
	}

}
