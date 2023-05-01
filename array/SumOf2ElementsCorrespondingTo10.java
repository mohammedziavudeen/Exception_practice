package array;

public class SumOf2ElementsCorrespondingTo10 {

	public static void main(String[] args) {
		int[] n= {9,1,8,7,3,4,6};
		int count=0;
		for(int i=0;i<n.length-1;i++) {
			int first=n[i];
			int second=n[i+1];
			if(first+second==10) {
				count+=2;
			}
		}
		int[] result=new int[count];
		for(int j=0;j<n.length;j++) {
		for(int i=j+1;i<n.length;i++) {
	
			if(n[j]+n[i]==10) {
				System.out.println(n[j]);
				System.out.println(n[i]);
			}
		} }
	/*
	 * for(int i=0;i<result.length;i++) { System.out.println(result[i]); }
	 */
	}

}
