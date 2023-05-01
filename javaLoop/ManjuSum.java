package javaLoop;

public class ManjuSum {

	public static void main(String[] args) {
		int n=1329,res=9;
		boolean chk=false;
		while(n>0) {
			int unit=n%10;
			if(res>=unit)
				res=unit;
			else {
				chk=true;
				System.out.println("no");
				break;
			}
			n=n/10;
		}
		if(chk==false) {
			System.out.println("yes");
		}

	}

}
