package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringRepeat {

	public static void main(String[] args) {
		String s="mohammed ziavudeen";
		HashMap<Character, Integer> h = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
			if(h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), h.get(s.charAt(i))+1);
			}
			else {
				h.put(s.charAt(i), 1);
			}
		}
		//System.out.println(h);
		for(Entry<Character, Integer> entry: h.entrySet()) {
			if(entry.getValue()>1) {
System.out.println(entry.getKey()+" repeat"+" "+entry.getValue()+" "+"times");
			}
		}
	}

}

