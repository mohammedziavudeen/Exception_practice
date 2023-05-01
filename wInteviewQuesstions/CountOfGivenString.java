package wInteviewQuesstions;

public class CountOfGivenString {

	public static void main(String[] args) {
		String s="zia ziamohammed ziavu moha ziavudeen",ss="zia";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(ss.charAt(0)==s.charAt(i)) {
				int m=i+1;
				int count=1;
				for(int j=1;j<ss.length()&&m<s.length();m++,j++) {
					if(s.charAt(m)==ss.charAt(j)) {
						count++;
					}
					else
						break;
				}
				if(s.charAt(m)==' ')
				if(count==ss.length())
					sum++;
			}
			
		}
		System.out.println(ss+" apprears "+sum+" times" );

	}

}
