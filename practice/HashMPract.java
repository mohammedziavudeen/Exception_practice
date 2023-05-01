package practice;

import java.util.HashMap;

public class HashMPract {
	
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		String name="mohammed";
		for(int i=0;i<name.length();i++) {
			if(hm.containsKey(name.charAt(i))) {
				Object o=hm.get(name.charAt(i));
				int count=(Integer) o;
				hm.put(name.charAt(i), count+1);
			}
			else {
				hm.put(name.charAt(i), 1);
			}
		}
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm);
		
		
		
		}
}
