package arrayPractice;

import java.util.Arrays;

public class HighestOccurences {

	public static void main(String[] args) {
		int[] ar = { -1,-2,-3,-4,3, 4, 5, 5, 6,7, 2, 3, 2, 9 ,10, 12};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int big=1;
		int count=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1]-ar[i]==1) {
			  	count++;
			}
			else if(big<count){
				big=count;
				count=1;
			}
				
		}System.out.println("mostoccurances = "+big);

	}

}
