package collectionpractice;
import java.util.ArrayList;
import java.util.TreeSet;
public class PracticeTreeSet {

	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		
		//ob.add(123);
		//ob.add(232);
		ob.add("zia");
		ob.add("zaivudeen");
		//ob.add(100);
		ob.add("zia");
		TreeSet t = new TreeSet(ob);
//		for(Object o:ob) {
//			try{
//				t.add((Integer) o);
//			}
//			catch(ClassCastException e) {
//				
//			}
		//}
		System.out.println(t);

System.out.println(t);
	}

}
