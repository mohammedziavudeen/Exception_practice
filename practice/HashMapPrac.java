package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrac {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap();
		hm.put("dhoni", 90);
		hm.put("raina", 50);
		hm.put("mohammed", 60);
		hm.put("jadeja", 100);
		Set s=hm.entrySet();
		//System.out.println(hm.ge("raina"));;
		System.out.println(s);
		int big=0;
		for(Object o:s) {
			Entry entry=(Entry)o;
			String player=(String) entry.getKey();
			if(player.equals("dhoni")) {
				System.out.println(entry.getValue());
			}
			int score=(int) entry.getValue();
			if(score>big) {
				big=score;
				//System.out.println(o);
			}
		}
		System.out.println(hm.get(big));
	}
}
