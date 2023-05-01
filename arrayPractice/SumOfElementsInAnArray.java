package arrayPractice;

import java.util.Arrays;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		int ar1[] = {10, 20, 30, 40, 50};
		int ar2[] = {9, 18, 27, 36, 45, 10, 22};
		int small=ar1.length<ar2.length?ar1.length:ar2.length;
		int big[]=new int [ar1.length>ar2.length?ar1.length:ar2.length];
		for(int i=0;i<big.length;i++) {
			if(i<small)
			big[i]=ar1[i]+ar2[i];
			else
				big[i]=ar2[i];
		}
		System.out.println(Arrays.toString(big));
	}
}