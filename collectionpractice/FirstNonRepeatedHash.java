package collectionpractice;

import java.util.TreeMap;

public class FirstNonRepeatedHash {

	public static void main(String[] args) {
		TreeMap hm =new TreeMap();
		String name="mohammod";
		for(int i=0;i<name.length();i++) {
			if(hm.containsKey(name.charAt(i))) {
				System.out.println("the first non repeated element is"+name.charAt(i));
				break;
			}
			else
				hm.put(name.charAt(i), 1);
	}

}
}
