package javaLoop;
public class FibonacciWitoutThirdVariable {
	public static void main(String[] args) {
		int f=0,s=1,count=0;
		while(count<5) {
			System.out.println(f);
			System.out.println(s);
			f=f+s;
			s=f+s;
			count++;
		}
	}
}
