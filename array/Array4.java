package array;

public class Array4 {

	public static void main(String[] args) {
		Array4 ar=new Array4();
		ar.arMethod();
	}
	private void arMethod() {
		String[] sub= {"zia","ziavu","mohd","ziavudeen"};
		for(int i=0;i<sub.length;i++) {
			if(sub[i]=="ziavu") {
			System.out.println(i);		
		}
	}
	}
}
