package string;

public class RepeatedCharactersInString {

	public static void main(String[] args) {
		String name="qmuthuramalingam is a java trainer";
		boolean[] app=new boolean[name.length()];
		for(int i=0;i<name.length()-1;i++) {
			if(name.charAt(i)!=' ')
			if(app[i]==false) {
				int count=1;
				for(int j=i+1;j<name.length();j++){
					if(name.charAt(i)==name.charAt(j)) {
						app[j]=true;
						//app[i]=true;
						count++;
					}
				}
					System.out.println(name.charAt(i)+" is appeared "+count+" times");
			}
		}

	}

}
