package string;

public class PrintingNumbersOnly {

	public static void main(String[] args) {
		String mail="mdziavu443@gmail.com";
		for(int i=0;i<mail.length();i++) {
			char ab=mail.charAt(i);
			if(ab>='1' && ab<='9') {
				System.out.print(mail.charAt(i));
			}
		}

	}

}
