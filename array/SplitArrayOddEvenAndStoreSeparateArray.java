package array;

public class SplitArrayOddEvenAndStoreSeparateArray {

	public static void main(String[] args) {
		int n[]= {34,6,75,88,50,99};
		int OddCount=0;
		int EvenCount=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				EvenCount++;
			}
			else {
				OddCount++;
			}
		}
		int[] Even=new int[EvenCount];
		int[] Odd=new int[OddCount];
		int j=0,m=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				Even[j]=n[i];
				j++;
			}
			else {
				Odd[m]=n[i];
				m++;
			}
		}
		for(int i=0;i<Odd.length;i++) {
			System.out.println(Odd[i]);
		}
		

	}

}
