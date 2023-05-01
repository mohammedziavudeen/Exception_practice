package string;

public class Nma {
	//a=@, e=$, i=&, o=%, u=#
	public static void main(String[] args) {
		String name="Hello Qantler",name2="";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				name2=name2+'@';
			}
			else if(ch[i]=='e') {
				name2=name2+'$';
			}
			else if(ch[i]=='i') {
				name2=name2+'&';
			}
			else if(ch[i]=='o') {
				name2=name2+'%';
			}
			else if(ch[i]=='u') {
				name2=name2+'#';
			}
			else {
				name2=name2+ch[i];
			}
			
			
		}
		System.out.println(name2);
			
		

	}

}
