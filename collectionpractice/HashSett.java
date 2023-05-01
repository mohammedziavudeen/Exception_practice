package collectionpractice;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSett {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add("eeuw");
		obj.add("eeuw");
		obj.add(2);
		obj.add(2);
		System.out.println(obj.contains(2));;
		System.out.println(obj);
		TreeSet obj1=new TreeSet();
		Object o=new Object();
		o=obj.clone();
		System.out.println(o);
		obj1.add(11);
		obj1.add(11);
		obj1.addAll(obj);
		System.out.println(obj1);
	}

}
