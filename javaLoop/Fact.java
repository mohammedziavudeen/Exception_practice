package javaLoop;

public class Fact {


	public static void main(String[] args) {
		int n=5;
		while(n>0) {
			System.out.println(method(n)); ;
			n--;
		}
	}
	private static int method(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
}