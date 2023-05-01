package string;
public class Anogram {
	public static void main(String[] args) {
		String name1="carr ",name2="arec ";
		boolean[] repeat=new boolean[name1.length()];
		int count=0;
		if(name1.length()==name2.length()) {
		for(int i=0;i<name1.length();i++) {
			for(int j=0;j<name2.length();j++) {
				if(name1.charAt(i)==name2.charAt(j)) {
			     	repeat[i]=true;
					count++;
					break;
				}
			}
			if(repeat[i]==false) {
				System.out.println("Not a anagram");
				break;
			}
		}
		if(count==name1.length()) {
			System.out.println("Anagram");
		}     
		}
		else {
			System.out.println("Not a anagram");
		}
	}
}