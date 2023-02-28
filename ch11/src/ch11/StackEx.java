package ch11;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		String[] pet = {"강아지", "야옹이", "물고기", "야옹이"};
		Stack<String> st = new Stack<String>();
		for(String str : pet) {
			System.out.println("push --> " + str);
			st.push(str);
		}
		System.out.println("================");
		while(!st.isEmpty()) {
			System.out.println("POP -> " + st.pop());
		}
	}
}
