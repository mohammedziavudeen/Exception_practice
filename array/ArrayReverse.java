package array;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] ar= {8,15,12,53,35};
		int len=ar.length;
		int[] rev=new int[ar.length];
		int i=0;
		while(i<len) {
			int extra=ar[i];
			rev[i]=ar[len-i-1];
			rev[len-i-1]=extra;
			System.out.println(rev[i]);
			i++;
			
		}

	}

}
