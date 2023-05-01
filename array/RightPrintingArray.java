package array;

public class RightPrintingArray {

	public static void main(String[] args) {
		int[] num= {3,54,67,31,6};
		int empty=num[num.length-1];
		int i=num.length-1;
		int[] ar=new int[num.length];
		for(;i>0;i--) {
			num[i]=num[i-1];
			ar[i]=num[i];
		}
		num[i]=empty;
		ar[i]=num[i];
		for(int j=0;i<ar.length;j++) {
			System.out.println(ar[j]);
		}
	
	}

}
