package javaLoop;

public class PlaindromeString {
	public static void main(String[] args) {
		String s="dad mom child";
		String ss="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				method(ss);
				ss="";
			}
			else {
				ss=ss+s.charAt(i);
			}
		}
}
	private static void method(String ss) {
		String m="";
		for(int i=ss.length()-1;i>=0;i--) {
			m=m+ss.charAt(i);
		}
		if(m.equals(ss)) {
			System.out.println(m+" is palindrome");
		}
		m="";
	}
}