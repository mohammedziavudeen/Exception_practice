package string;

import java.util.ArrayList;

public class CountTheENd {

	public static void main(String[] args) {
		int[] no= {101, 422, 33, 441, 572, 163, 770, 782, 499, 500};
		ArrayList count2= new ArrayList();
		ArrayList count3= new ArrayList();
		for(int i=0;i<no.length;i++) {
			if(no[i]%10==3) {
				count3.add(no[i]);
				//System.out.println(count2);
			}
			else if(no[i]%10==2) {
				count2.add(no[i]);
			}
		}
		
		System.out.println("Ends with 3 count is"+count3);
		System.out.println("Ends with 2 count is"+count2);

	}

}
