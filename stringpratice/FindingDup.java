package stringpratice;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindingDup {

	public static void main(String[] args) {
		String s="ziavudeeny is a good boy";
		HashSet ss=new HashSet();
		boolean[] c=new boolean[s.length()];
		for(int i=0;i<s.length()-1;i++) {
			if(c[i]==false) {
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(i)!=' ')
					if(s.charAt(i)==s.charAt(j)) {
						c[j]=true;
						ss.add(s.charAt(i));		
					}
				}
			}
		}
		System.out.println(ss);

	}

}
