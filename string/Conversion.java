package string;

public class Conversion {

	public static void main(String[] args) {
		Conversion obj=new Conversion();
		obj.method();//char to String
		obj.method1();//integer to string
		obj.method2();//boolean to string
		obj.method3();//String to integer
		obj.method4();

	}
	private void method4() {
		String st="234.42992";
		float f=Float.parseFloat(st);
		System.out.println(f);
		
	}
	private void method3() {
		String n="1225";
		int no=Integer.parseInt(n);
		System.out.println(no);
		
	}
	private void method2() {
		boolean result=true;
		String s=String.valueOf(result);
		System.out.println(s);
		
	}
	private void method1() {
		int n=1234;
		String s=String.valueOf(n);
		System.out.println(s);
		
	}
	
	private void method() {
		char[]ch= {'z','i','a','v','u'};
		String s=new String(ch);
		System.out.println(s);
	}

}
