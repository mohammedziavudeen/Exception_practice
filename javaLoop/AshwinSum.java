package javaLoop;

public class AshwinSum {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			int no=n*i;
			System.out.print(no+" ");
			if(no==25) {
				i=0;
				n=4;
			}
		}
	}
}
