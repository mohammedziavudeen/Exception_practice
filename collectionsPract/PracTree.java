package collectionsPract;

import java.util.Map;
import java.util.TreeMap;

public class PracTree {

	public static void main(String[] args) {
		TreeMap<String,Integer> t = new TreeMap();
		String[] s= {"zia","ziavu","zia","mohd","mohammed","ziavu"};
		for(String ss:s) {
			if(t.containsKey(ss)){
				t.put(ss, t.get(ss)+1);
			}
			else {
				t.put(ss, 1);
			}
				}
		System.out.println(t);
		for(Map.Entry<String, Integer> entry : t.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				t.replace("ziavu", 5);
				//t.remove(t.get(entry.getKey()));
				//t.remove(entry.getKey(), entry.getValue());
			}
		}
		System.out.println(t);
	}
}