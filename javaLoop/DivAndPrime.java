package javaLoop;

public class DivAndPrime {

	public static void main(String[] args) {
		int div=2;
		while(50>=div) {
			if(50%div==0) {
				boolean chk=method(div);
				if(chk==false)
					System.out.println(div);
			}div++;
		}

	}
	private static boolean method(int no) {
		int div=2;
		boolean chk=false;
		while(no/2>div) {
			if(no%div==0) {
				chk=true;
				break;
			}
		}
		return chk;
	}

}
