package collectionsPract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Pract1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		Scanner s= new Scanner(System.in);
		
		Character ch=' ';
		while(ch!='s') {
			System.out.println("Enter num");
			al.add(s.nextInt());
			System.out.println("Press 's' to stop");
			ch=s.next().charAt(0);
		}
		
		int[] ar= new int[al.size()];
		for(int i=0;i<al.size();i++) {
			ar[i]=al.get(i);
		}
		for(Integer i:ar) {
			System.out.print(i);
		}
	}
}