package arrayPractice;
import java.util.Arrays;
public class MissingRepeated {

	public static void main(String[] args) {
		int[] ar = { 7, 3, 4, 5, 5, 6, 2, 3, 2, 9 ,10, 12};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]) {
				System.out.println("repeated elements= "+ar[i]);
			}
		}
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1]-ar[i]==0) {
				continue;
			}
			else if(ar[i+1]-ar[i]!=1) {
				int m=ar[i]+1;
				System.out.println("missing elements= "+m);
			}
		}
		
	}
}
