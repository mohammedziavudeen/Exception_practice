package string;

public class UpperCase {

	public static void main(String[] args) {
		String name="ziavudeen";
		char ch[] =name.t
		//System.out.println(name.toUpperCase());
		//System.out.println(name);
		String name1="ZIAVUDEENmoh@123";
		//System.out.println(name1.toLowerCase());
		char ch=name1.charAt(0);
		//System.out.println(ch);
		//System.out.println(ch+32);
		//System.out.println(ch-32);
		//name1.
//		for(int i=0;i<name1.length();i++) {
//			char ch1=name1.charAt(i);
//			if(ch1>='A'&&ch1<='Z') {
//				if(i%2==0) {
//					System.out.print(ch1);
//				}
//				else {
//					System.out.print((char)(ch1+32));
//				}
//			}
//			
//		
//		}
		method();
		//method2();//equals comparition
		//method3();
		//method4();//split
	}
private static void method4() {
		String name="18-dec-1999",name2="";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!='-') {
				name2=name2+name.charAt(i);
			}
			else {
				name2=name2+" ";
				//System.out.print(name2+ " ");
			}
		}
		System.out.print(name2);
	}
private static void method3() {
		String name="ziavudeen.jpeg",name2="";
		int len=name.length()-4;
		for(int i=len;i<name.length();i++) {
			name2=name2+name.charAt(i);
			
		}
		if(name2.equals("jpeg")) {
			System.out.println("Equals");
		}
		
		
	}
	static void method() {
		String name="ZIAVUDEEN";
		String ch=name.toLowerCase();
		System.out.println(ch+" "+name);
	}

	private static void method2() {
		String name="Ziavudeen";
		//System.out.println(name.substring(3,6));
		
	}
	

}
