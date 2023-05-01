package string;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String name="ziavudeen.pdf",name2="";
		method(name);
		int len=name.length()-4;
		for(int i=len;i<name.length();i++) {
			name2=name2+name.charAt(i);
		}
		if(name2.equals(".pdf")){
			System.out.println("It is pdf file");
		}
		else {
			System.out.println("It is not pdf file");
		}
	}
	private static void method(String name) {
		name ="zia moh ziavudeen mohammed";
		String[] name2=new String[2];
		name2=name.split("m");
		System.out.println(name2.length);
		System.out.println(Arrays.toString(name2));
	}
}