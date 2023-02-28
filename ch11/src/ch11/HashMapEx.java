package ch11;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("손흥민",  "010-3333-3333");
		hm.put("김준수",  "010-2222-3456");
		hm.put("조정은",  "010-3456-7890");
		hm.put("조정은2", "010-3456-7893");
		
		System.out.println("손흥민 TEL: " +  hm.get("손흥민"));
		System.out.println("김준수 TEL: " +  hm.get("김준수"));
		System.out.println("조정은 TEL: " +  hm.get("조정은"));
		System.out.println("조정은2 TEL: " + hm.get("조정은2"));
	}

}
