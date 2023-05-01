package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringArr {

	public static void main(String[] args) {
		String[] s= {"mohammed"," ziavudeen","mohammed","ziavudeen"};
		HashMap<String, Integer> h = new HashMap<>();
		for(int i=0;i<s.length;i++) {
			if(h.containsKey(s[i])) {
				h.put(s[i], h.get(s[i])+1);
			}
			else {
				h.put(s[i], 1);
			}
		}
		//System.out.println(h);
		for(Entry<String, Integer> entry: h.entrySet()) {
			if(entry.getValue()>1) {
System.out.println(entry.getKey()+" repeat"+" "+entry.getValue()+" "+"times");
			}
			else
				System.out.println(entry.getKey()+" repeat"+" "+entry.getValue()+" "+"times");
				
		}
	}

}

