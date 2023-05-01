package javaLoop;

public class LCM {

	public static void main(String[] args) {
		int n1=8,n2=12;
		int big=n1>n2?n1:n2;
		boolean chk=false;
		while(chk==false) {
			if(big%n1==0&&big%n2==0) {
				chk=true;
				System.out.println(big);
			}big++;
		}

	}

}
