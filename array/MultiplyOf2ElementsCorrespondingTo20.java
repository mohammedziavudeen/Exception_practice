package array;

public class MultiplyOf2ElementsCorrespondingTo20 {

	public static void main(String[] args) {
		int[] n= {4,5,6,2,10,2,5,4};
		for(int i=0;i<n.length-1;i++) {
			int first=n[i];
			int Second=n[i+1];
			if(first*Second==20) {
				System.out.println(n[i]);
				System.out.println(n[i+1]);
			}
		}

	}

}
