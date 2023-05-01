package javaLoop;
import java.util.Scanner;
public class NeonStringSpy {

	public static void main(String[] args) {
		System.out.println("Enter nu");
		Scanner s=new Scanner(System.in);
		//method1(s);//neon
		//method2(s);//strong 145 5=120 4=24 1=1
		method3(s);//123spy.sum and prod should equal 3*2*1=6..3+2+1=6..1124spy
		
	}
	private static void method3(Scanner s) {
		int n=s.nextInt(),prod=1,sum=0;
		while(n>0) {
			sum=sum+(n%10);
			prod=prod*(n%10);
			n=n/10;
		}
		if(sum==prod)
			System.out.println("Spy  num");
		else
			System.out.println("Not spy");
	}
	private static void method2(Scanner s) {
		int n=s.nextInt(),total=0,m=n;
		while(n>0) {
			total=total+strong(n%10);
			n=n/10;
		}
		if(m==total) {
			System.out.println("STrog");
		}
		else
			System.out.println("Not strong");
	}
	private static int strong(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	private static void method1(Scanner s) {
		int n=s.nextInt();
		int m=n*n,sum=0;
		while(m>0) {
			sum=sum+(m%10);
			m=m/10;
		}
		if(sum==n) {
			System.out.println("Neon num");
		}
		else
			System.out.println("Not neon");		
	}
}