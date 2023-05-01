package javaLoop;
public class PrimeFind {
	public static void main(String[] args) {
		int n=2,count=0;
		while(count<20) {
		boolean chk=method(n);
		if(chk==false) {
			count++;
			System.out.println(n);
		}
		n++;
		}
	}
	private static boolean method(int n) {
		int div=2;
		boolean chk=false;
		while(n/2>div) {
			if(n%div==0) {
				chk=true;
				break;
			}div++;
		}
		return chk;
	}

}
