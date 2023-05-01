package string;

import java.util.Scanner;

public class IgnoreSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String name=sc.nextLine();
		System.out.println("Enter the SubString to check");
		String check=sc.next();
		boolean first=false;
		int sum=0;
		for (int i=0;i<name.length();i++) {	
		if(name.charAt(i)==check.charAt(0)) {
			int count=1;
			int m=i+1;
			for(int j=1;j<check.length()&&m<name.length();j++,m++) {
				if(name.charAt(m)==check.charAt(j)) {
				count++;
			}
				else {
					break;
				}			
		}
			if(count==check.length()) {
				System.out.println("yes");
				first=true;
				sum++;
				//break;
			}
	}
	}
		System.out.println(check+" appeared"+sum+" times");
		if(first==false) {
			System.out.println("Not a substring");
		}
}
}