package string;

public class HighestElementInString {

	public static void main(String[] args) {
		String name="abdul kalam apj";
		boolean[] check=new boolean[name.length()];
		int big=0;char high=name.charAt(0);
		for(int i=0;i<name.length()-1;i++) {
			int count=1;
			for(int j=1;j<name.length();j++) {
				if(check[i]==false) {
					if(name.charAt(i)==name.charAt(j)) {
						count++;
						check[j]=true;
					}
				}	
			}
			if(big<count) {
				big=count;
				high=name.charAt(i);
			}
		}System.out.println(high+" appeared "+big +" times and which is highest repeated characters in given string");

	}

}
