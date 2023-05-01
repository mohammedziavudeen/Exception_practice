package arrayPractice;

public class SubSet {

	public static void main(String[] args) {
		int[] ar1= {3,4,6,18,28,41};
		int[] ar2= {28,6,4,4,4,1};
		int count=0;
		for(int i=0;i<ar2.length;i++) {
			boolean ap=false;
			for(int j=0;j<ar1.length;j++) {
				if(ar2[i]==ar1[j]) {
					count++;
					ap=true;
					break;
				}
			}
			if(ap==false) {
				System.out.println("Not a subset");
				break;
			}
		}
		if(count==ar2.length) {
			System.out.println("Subset");
		}
	}
}