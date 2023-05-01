package practice;

public class PrimeRecursion {

	public static void main(String[] args) {
		int n=30,div=2;
		boolean first=false;
		first=method(n,div,first);
		if(first==true) {
			System.out.println("not prime");
		}
		else {
			System.out.println("Prime");
		}
	}
	static boolean method(int n, int div,boolean first) {
		if(n%div==0) {
			first=true;
			return first;
		}
		if(n/2<div) {
			return first;	
		}

		return first=method(n,div+1,first);
	}

}
