package array;

public class Subset {

	public static void main(String[] args) {
		int[] n= {3,4,6,18,28,41};
		int[] n1= {28,6,4,4,4,4};
		int cc=n1.length;
		System.out.println(cc);
		boolean appeared=false;
		for(int j=0;j<n1.length;j++) {
			boolean match=false;
			for(int i=0;i<n.length;i++) {
				if(n1[j]==n[i]) {
					match=true;
					break;
				}		
			}
			if(match==false) {
				appeared=true;
				System.out.println("It is  not subset");
				break;
			}
		}
		if(appeared==false) {
			System.out.println("It is subset of array");
		}
		
	}
}
