package array;

public class AjacentTwoElements {

	public static void main(String[] args) {
		Array7 obj=new Array7();
			int[] ar= {7,2,18,16,3,7};
			for(int j=0;j<ar.length-1;j++) {
				int first=ar[j];
				int second=ar[j+1];
				int small=first<second?first:second;
				int big=first>second?first:second;
				for(int i=small+1;i<big;i++) {
					System.out.println(i);
				}
			}

	}

}
