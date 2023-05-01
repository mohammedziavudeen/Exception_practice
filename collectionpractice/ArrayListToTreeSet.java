package collectionpractice;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class ArrayListToTreeSet {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		List ob = new ArrayList();
		//method(obj);
		method1(ob);
	}
	private static void method1(List ob) {
		TreeSet t =new TreeSet();
		HashSet<String> h = new HashSet<String>();
	//	ob.add(221);
		ob.add("zia");
		ob.add(111);
		ob.add("jj");
		ob.add(1919);
		ob.add("mohamed");
		ob.add("jj");
		ob.add("mohamed");
		ob.add(1919);
		method3(ob);
		//System.out.println(ob);
		h.addAll(ob);
		h.add("yebcu");
		//System.out.println(h);
		try {
			t.addAll(h);
		}
		catch(ClassCastException ee){
			//System.out.println("class exception");
		}
		//System.out.println(t);
		//System.out.println(h);
//		Iterator il =ob.iterator();
//		while(il.hasNext()) {
//			try {
////				Object o=il;
////				String s=(String)o;
//				t.add(il.next());
//			}
//			catch(ClassCastException e) {
//				
//			}
//		}
	//	System.out.println(t);
	}

	private static void method3(List ob) {
		HashSet hh = new HashSet();
		HashSet hh1 = new HashSet();
		TreeSet t = new TreeSet();
		ArrayList al =new ArrayList();
		Object oo;
		for(Object o:ob) {
			boolean first=t.add(o);
			if (first==false) {
				System.out.println("repeated ="+o);
				al.add(o);
			}
		}
		System.out.println(t);
		System.out.println(al);
		
	}

	private static void method(ArrayList obj) {
			char ch=' ';
			Scanner sc=new Scanner(System.in);
			while(ch!='n') {
				System.out.println("Enter elements to add");
				obj.add(sc.next());
				System.out.println("to stop press 'n");
				ch=sc.next().charAt(0);
			}
			System.out.println(obj);
			TreeSet obj1 = new TreeSet(obj);
			for(Object o:obj) {
				try {
					o=obj;
					int i=(int)o;
					obj1.add(i);
				}
				catch(ClassCastException q) {
					
				}
			}
			
			System.out.println(obj1);
	}

}
