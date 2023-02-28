package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("표범");
		hs.add("사자");
		hs.add("호랑이");
		hs.add("하이에나");
		hs.add("표범");
		
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("================");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
