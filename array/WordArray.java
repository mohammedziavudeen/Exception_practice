package array;

import java.util.Scanner;

public class WordArray {

	public static void main(String[] args) {
			WordArray obj=new WordArray();
			obj.method();
											}
		public static void method() {
			//char[] ch=new char[4];
			Scanner obj=new Scanner(System.in);
			System.err.println("please enter 4 word letter");
			 
			 Scanner sc=new Scanner(System.in);
			    char[] ch=sc.next().toCharArray();
//			    for(int i=0;i<ch.length;i++) {
//			      System.out.println(ch[i]);
//			    }
			
//			String s =obj.next();
//			for(int i=0;i<s.length(); i++)
//			{
//				ch[i]=s.charAt(i);
//			}
			
//			for(int i=0;i<s.length(); i++)
//			{
//				System.out.println("index of "+i+"is "+ch[i]);
//				
//			}	
			char[] ar=new char[4];
			char[] ch1= {'s','t','o','p'};
			for(int j=0;j<ch1.length;j++) {
				boolean[] check=new boolean[4];
				for(int i=0;i<ch1.length;i++) {
					if(ch[j]==ch1[i]) {
						ch[j]='p';
						check[j]=true;
						//System.out.println(j);
						if(j==i) {
							ar[j]='c';
						}
					}
				}
				if(check[j]==false) {
					ar[j]='x';
				}
			}	
			for(int i=0;i<ch1.length;i++) {
				System.out.print(ar[i]);
			}
			int count=0;
			for(int i=0;i<ch1.length;i++) {
				if(ar[i]=='c') 
					count++;
			}
			if(count==4) {
				System.out.println("Matching number");
			}
			else
				System.out.println("Non Matching number");
				method();		
		}
}