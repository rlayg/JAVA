package ch11;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("손흥민",  "010-3333-3333");
		ht.put("김준수",  "010-2222-3456");
		ht.put("조정은",  "010-3456-7890");
		
		System.out.println("손흥민 TEL: " +  ht.get("손흥민"));
		System.out.println("김준수 TEL: " +  ht.get("김준수"));
		System.out.println("조정은 TEL: " +  ht.get("조정은"));
		
	}

}
