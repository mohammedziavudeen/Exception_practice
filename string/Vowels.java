package string;

public class Vowels {

	public static void main(String[] args) {
		String Name="ziavudeen";
		char[]ab= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<ab.length;i++) {
			for(int j=0;j<Name.length();j++) {
				if(ab[i]==Name.charAt(j)) {
					count++;
				}
			}
		}System.out.println(count);

	}

}
