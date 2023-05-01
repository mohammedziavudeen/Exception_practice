package array;

public class LeftTwicePrintingArray {

	public static void main(String[] args) {
		int n[]= {53,64,24,7,94};
		int i=0;
		int extra=n[i];
		int extra1=n[i+1];
	
		for(;i<n.length-2;i++) {
			
			n[i]=n[i+2];
			System.out.println(n[i]);
			
		}
		n[i]=extra;
		System.out.println(n[i]);
		n[i+1]=extra1;
		System.out.println(n[i]+1);
	}
}
