package practice;

public class HighestNO {

	public static void main(String[] args) {
		int[] ar= {32,54,78,34,62,12};
		int first=ar[0],second=ar[0];
		for(int i=1;i<ar.length-1;i++) {
			if(first<ar[i]) {
				second=first;
				first=ar[i];
			}
			else if(second<ar[i]) {
				second=ar[i];
			}
		}
		System.out.println(first+" "+second);

	}

}
