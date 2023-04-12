package exception;

import java.util.Scanner;
public class NumberFormatExcep{

	public static void main(String[] args) {
		 // method();
		  Scanner sc=new Scanner(System.in);
	      double d=sc.nextDouble();
	      String s=sc.nextLine();
	      System.out.println(s);
	      int m;
	      System.out.println(m=sc.nextInt());
	         System.out.println(d);
	          
	}

	private static void method() {
		Scanner sc=new Scanner(System.in);
//	      String s=sc.nextLine();
		  try {
			  int n=Integer.parseInt(sc.nextLine());
			  System.out.println(n);
		  }
		  catch (NumberFormatException e) {
			System.out.println("Kindly enter only integer");
			method();
		}
		
	}
	

}
