package arrayPractice;

import java.util.Arrays;

import array.Array;

public class InsertingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stubArray = {10, 20, 30, 40, 50};
		//Element to be inserted = 99;
		//Position = 3;
		//Final result = {10, 20, 30, 99, 40, 50};
		int [] ar = {10, 20, 30, 40, 50, 30, 10, 90};
		//int [] ar = {10, 20, 30, 40, 50, 30, 10, 90, };

		int el=99;
		int[] temp=new int[ar.length+1];
		System.out.println(Arrays.toString(ar));
		for(int i=0,j=0;i<temp.length;i++) {
			if(i==3)
				temp[i]=el;
			else {
				temp[i]=ar[j];
			j++;}
			
		}
		System.out.println(Arrays.toString(temp));
	}

}
