package array;

public class DIvideAllElementsBy3 {
	public static void main(String[] args) {
		int[] n= {43,53,6,89,45};
		int j=0;
		for(int i=0;i<n.length;i++) {
			n[j]=n[i]/3;
			System.out.println(n[j]);
			j++;
		}
		}
}
