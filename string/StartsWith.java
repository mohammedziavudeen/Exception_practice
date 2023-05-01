package string;

public class StartsWith {

	public static void main(String[] args) {
		StartsWith obj=new StartsWith();
		obj.starts();
}

	private void starts() {
		String name1="ziavudeen",name2="ziavu";
		boolean first=false;int count=0;
		for(int i=0;i<name2.length();i++) {
			if(name1.charAt(i)==name2.charAt(i)) {
				count++;
			}
			else {
				first=true;
				break;
			}
		}
		if(first==false) {
			System.out.println("Name starts with");
		}
		
	}	
		

	

}
