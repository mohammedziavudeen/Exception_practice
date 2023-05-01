package javaLoop;

public class Palin {

	public static void main(String[] args) {
		int n=133,rev=0,num=n;
		while(n>0) {
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		System.out.println(rev);

	}

}
