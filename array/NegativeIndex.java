package array;

public class NegativeIndex {

	public static void main(String[] args) {
		int[] n= {43,64,24,74,6};
		int[] neg=new int[n.length/2];
		int i=1,j=0;
		while(i<n.length) {
			neg[j]=n[i];
			System.out.println(neg[j]);
			i+=2;
			j++;
		}

	}

}
