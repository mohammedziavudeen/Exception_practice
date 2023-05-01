package arrayPractice;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		int[] ar= {10,20,30,40,50,60};
		System.out.println("ENter the number should search");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		int min=0,max=ar.length-1,mid=(min+max)/2;
      	//System.out.println(mid);
		while(min<=max) {
			if(key==ar[mid]) {
				System.out.println(mid);
				break;
			}
			else if(ar[mid]<key) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
			mid=(min+max)/2;
		}
		if(min>max) {
			System.out.println("element not in array");
		}
		System.out.println(1/2);
	}
}
