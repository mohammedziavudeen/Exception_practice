package practice;

public class StringImmu {
	static final String name="zia";
	public static void main(String[] args) {
		String name1="ziavu";
		String name2=method1(name1);
		System.out.println(name2);
		//name1="ziavudeen";
		System.out.println(name1);
		int[]ar= {5,7,4};
		int[]ar1=method(ar);
		System.out.println(ar[0]+ar[1]+ar[2]+" ");
		System.out.println(ar1[0]+ar1[1]+ar1[2]+" ");	
	}
	private static String method1(String name) {
		name="moha";
		return name;
	}
	private static int[] method(int[] array) {
		array[1]=9;
		 return array;
	}
}
