package collectionpractice;

import java.util.TreeMap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapPractice {
	public static void main(String[] args) {
		TreeMap<Integer,String> o = new TreeMap<Integer,String>();
		//System.out.println(o);
		o.put(1,"zia");
		o.put(2, "ziavudeen");
		o.put(0, "mohammed");
		o.put(0, "zia");
		o.put(2,"zaih");
		Set s = o.entrySet();
		for(Object obb:s) {
			Entry entry =(Entry) obb;
			String st=(String) entry.getValue();
			if(st.equals("zia")) {
				System.out.println(entry.getKey());
			}
		}
		//o.put(null, null);
		System.out.println(o);
	}
}