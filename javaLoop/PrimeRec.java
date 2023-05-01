package javaLoop;
public class PrimeRec {
static boolean chk=false;
	public static void main(String[] args) {
		int n=25,div=2;
		int no=find_prime(n,div);
		System.out.println(no);
		if(chk==true) {
			System.out.println("Not prime");
		}
		else
			System.out.println("prime");
	}
	private static int find_prime(int n, int div) {
		if(n/2==div) {
			return n;
		}
		if(n%div==0) {
			chk=true;
			return n;
		}
		div++;
		return find_prime(n,div);
	}
}