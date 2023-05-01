package string;

public class ReverseString {

	public static void main(String[] args) {
		String name="ziavu is a good",name2=" ";
		for(int i=name.length()-1;i>=0;i--) {
			name2=name2+name.charAt(i);
		}
		int j=0;
		for(int i=0;i<name2.length();i++) {
			if(name2.charAt(i)==' ') {
				reverse(j,i-1,name2);
				j=i+1;
			}
		}
	}
	private static void reverse(int s, int e, String name2) {
		String name3=			" ";
		for(int i=e;i>=s;i--) {
			name3=name3+name2.charAt(i);
		}System.out.println(name3);
		
	}

}
