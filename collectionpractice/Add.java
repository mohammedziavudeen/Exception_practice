package collectionpractice;
import java.util.ArrayList;
import java.util.Collection;
public class Add {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.add(45));
		System.out.println(al.addAll(45));
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al2.addAll(al));
		System.out.println(al2);
		//al.clear();
		System.out.print(al);
	}

}
