package string;
public class EndsWith {
	public static void main(String[] args) {
		String name1="ziavuttdeen",name2="deen";
		int j=name2.length()-1,i=name1.length()-1;
		for(;i>name2.length();i--) {
			if(name1.charAt(i)==name2.charAt(j)){
				j--;
			}
			else 
				break;
		}
		if(i==name2.length()) {
			System.out.println("ends with");
		}
		else {
			System.out.println("given string not ends with");
		}
	}
}