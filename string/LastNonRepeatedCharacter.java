package string;

public class LastNonRepeatedCharacter {

	public static void main(String[] args) {
		String name="malayalam",name2="";
		boolean[] app=new boolean[name.length()];
		for(int i=name.length()-1;i>=0;i--) {
			if(app[i]==false) {
				for(int j=i-1;j>=0;j--) {
					if(name.charAt(i)==name.charAt(j)) {
						app[i]=true;
						app[j]=true;
						break;
					}
				}
				if(app[i]==false) {
					System.out.println("the first non repeated char is "+name.charAt(i));
				}
			}
			
		}

	}

}
