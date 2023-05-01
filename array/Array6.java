package array;
//Finding first two biggest numbers in a given array
//Finding first two smallest numbers in a given array
public class Array6 {
	public static void main(String[] args) {
		{int[] ar= {45,41,64,66,76};
		int first=ar[0],second=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(first<ar[i]) {
				second=first;
				first=ar[i];	
			}
			else if(second<ar[i]) {
				second=ar[i];
			}
		}
		System.out.println("First highest number"+first);
		System.out.println("Second highest number"+second); }
		{int[] ar= {45,41,64,66,76};
		int first=ar[0],second=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(first>ar[i]) {
				second=first;
				first=ar[i];				
			}
			else if(second>ar[i]) {
				second=ar[i];
			}
		}
		System.out.println("First smallest number"+first);
		System.out.println("Second smallest number"+second);

	}
}
}