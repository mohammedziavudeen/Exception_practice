package array;

public class Practice1 {

	public static void main(String[] args) {
		StringBuffer ss = new StringBuffer();
		ss.append("zia");
		System.out.println(ss);
	ss=	methodStringBuffer(ss);
	System.out.println(ss);
		String name="ziavudeen";
		
		String name1=method(name);
		System.out.println(name);
		System.out.println(name1);

	}

	private static StringBuffer methodStringBuffer(StringBuffer ss) {
		ss.replace(0, 1,"moh");
		return ss;
		
	}

	private static String method(String as) {
		as="ziavu";
		return as;
	}
	

}
