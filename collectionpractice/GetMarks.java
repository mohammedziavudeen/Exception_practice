package collectionpractice;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GetMarks {

	public static void main(String[] args) {
		
		method();
	}

	private static void method() {
		Scanner sc=new Scanner(System.in);
		ArrayList ls =new ArrayList();
		int n=0;
		while(n<6) {
		try {
			System.out.println("Enter marks");
		ls.add(sc.nextShort());
		n++;
		}
		catch(InputMismatchException e){
			System.out.println("Kindly enter the marks in numeric(1-100)");
			method();
		}
		}
		System.out.println(ls);
	}

}
