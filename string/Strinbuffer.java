package string;

public class Strinbuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		s.append("world");
		s.insert(2,"java");
		System.out.println(s);
		String ss="ziau zivu";

		System.out.println(ss.concat(ss));
		String s1="ziav";
		System.out.println(ss.contains(s1));
		StringBuffer ss1=new StringBuffer();
		ss1.append(ss.toUpperCase());
		System.out.println(ss1);
		StringBuffer m = new StringBuffer("Scaler");
		System.out.println("Object"+m);
		//Deleting the character at index 2.
		m.deleteCharAt(2);
		System.out.println(m);
		m.setCharAt(0, 'a');
		System.out.println(m);
		System.out.println("Object = "+m);

	}

}
