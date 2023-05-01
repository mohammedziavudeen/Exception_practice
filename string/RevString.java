package string;

public class RevString {
	public static void main(String[] args) {
		String name1="ziavudeen is a good boy",name2="";
		String result="";
		for(int i=name1.length()-1;i>=0;i--) {		
		 	if(name1.charAt(i)==' ') {
				result=result+method(name2)+' ';
				name2="";
			}
			else {
				name2=name2+name1.charAt(i);
			}
		}result=result+method(name2);
		System.out.println(result);
	}

	private static String method(String name2) {
		String temp="";
		for(int i=name2.length()-1;i>=0;i--) {
			temp=temp+name2.charAt(i);
		}//System.out.println(temp);
		return temp;
		
	}

}
