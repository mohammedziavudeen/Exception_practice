package string;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo obj=new StringDemo();
		//obj.method();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		//obj.method4();
		//obj.method5();
		//obj.method6();
		//obj.method7();
		obj.method8();
		//obj.method9();
		}
	private void method9() {
		String avanga="sus";
		String ivanga=new String(avanga);
		System.out.println((avanga==avanga)+" "+avanga.equals(ivanga));
		
	}
	private void method8() {
		String s="  ZiavudeenIsAGoodBoy";
		boolean space=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				space=true;
			}
			if(space==true) {
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
					System.out.print(' ');
				}
				System.out.print(s.charAt(i));
			}
			
		}
		
	}
	private void method7() {
		String s="123";
		int n=Integer.parseInt(s);
		System.out.println(n);
		
	}
	private void method6() {
		int n=123;
		String s=String.valueOf(n);
		System.out.println(s);
		
	}
	private void method5() {
		char[]ch= {'z','i','a','v','u'};
		String s=new String(ch);
		System.out.println(s);
	}
	private void method4() {
		String name="   Ziavudeen is a";
		boolean first=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				first=true;
			}
			if(first==true) {
				System.out.print(name.charAt(i));
			}
		}		
		}
		
	
	private void method3() {
		String name="/ziavu",name1=" ",name2=" ";
//		int i=0,j=name.length()-1;
//		while(i<=j) {
//			char temp=name.charAt(i);
//			name.charAt(i)=name
//			name.charAt(j)=temp;
//			i++;
//			j++;
//			
//		}
		char ab=name.charAt(0);
		int i=1;
		for(;i<name.length();i++) {
			name1=name1+(name.charAt(i));
		}if(i==5) {
			name1=name1+ab;
		}//System.out.println(name1);//to print iavuz
		if(name.equals(name1)) {
			//System.out.print("Palindrome");
		}
		else {
			//System.out.print("not");
		}
		for(int j=0;j<name.length();j+=2) {
			name2=name2+name.charAt(j);
		}
		System.out.println(name2);//to print zau
		
	}
	private void method2() {
		String sen="Hi hello how you";
		int count=1;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)=='.') {
				count++;
			}
		}//System.out.println("No of words:"+count);
		//System.out.println(sen.length());
		String name="ViratKholi";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>='A'&&ch<='Z'&&i!=0) {
				System.out.print(' ');
			}System.out.print(name.charAt(i));
		}
		String name1="Virat kholi India";
		for(int i=0;i<name1.length();i++) {
			//char ch=;
			if(name1.charAt(i)!=' ') {
			//System.out.print(name1.charAt(i));
			}//System.out.print(ch);
		}
		
	}
	private void method1() {
		String Name="MohamMEd@1234";
		int count=0;
		for(int i=0;i<Name.length();i++) {
			char ab=Name.charAt(i);
			if(ab>='1'&&ab<='9') {
				//System.out.print(Name.charAt(i));
				count++;
			}
		}System.out.println(count);
		//System.out.println(Name.length()-count);
		
	}
	private void method() {
		String Name="mohammed@1234";
		//Name.charAt(0);
		//char ch1=Name.charAt(0);
		//System.out.println(ch);
		for(int i=0;i<Name.length();i++) {
			//char ch=Name.charAt(i);
			System.out.print(Name.charAt(i));
	}System.out.println(Name.length());

}
}
