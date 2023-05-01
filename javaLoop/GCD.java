package javaLoop;

public class GCD {

	public static void main(String[] args) {
		int n2=76,n1=100,n3=8,div=1;
		int small=n1<n2?n1:n2;
		int result=div;
		while(small>div) {
			if(n2%div==0&&n1%div==0&&n3%div==0) {
				result=div;
			}
			div++;
		}System.out.println(result);

	}

}
