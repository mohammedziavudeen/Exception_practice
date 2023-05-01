package collectionpractice;
import java.util.Scanner;
import java.util.TreeSet;
public class TreeSetPrac {
	public static void main(String[] args) {
		TreeSet obj = new TreeSet();
		method(obj);
	}

	private static void method(TreeSet obj) {
		Scanner sc=new Scanner(System.in);
		char ch=' ';
		while(ch!='n') {
		System.out.println("Enter string type");
		obj.add(sc.next());
		System.out.println("To stop press 'n");
		ch=sc.next().charAt(0);
		}
		System.out.println(obj);	
	}
}