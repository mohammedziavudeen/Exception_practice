package string;

public class constraints {

	public static void main(String[] args) {
		String name1="ziavugoogoon id a goof",name2="good";
		boolean first=false;
		for(int i=0;i<name1.length();i++) {
			if(name2.charAt(0)==name1.charAt(i)) {
				int count=0;
			for(int j=0;j<name2.length();j++) {
				if(name2.charAt(j)==name1.charAt(i)) {
					i++;
					count++;						
					if(count==name2.length()) {
						first=true;
						System.out.println("constrain");
						break;
					}
													  }
				else {
					//System.out.println("not a constraints");
					break;
				}
				}
			}
		}
		if(first==false) {
			System.out.println("It is not constraints");
		}
		
		}
		}


	

