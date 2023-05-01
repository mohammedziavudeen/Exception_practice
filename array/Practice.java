package array;

public class Practice {

	public static void main(String[] args) {
		int[] a= {3,4,5};
		int[]a1= fix(a);
		System.out.println(a[0]+a[1]+a[2]+" ");
		System.out.println(a1[0]+a1[1]+a1[2]);
		String name="Zia is a";
		String name1=fix1(name);
		System.out.println(name);
	    System.out.println(name1);

	}

	private static int[] fix(int[] a) {
		a[0]=9;
		return a;
	}

	private static String fix1(String name) {
		name="ziavudeen";
		
		return name;
	}

//	private static int[] fix(int[] array) {
//		array[1]=7;
//		return array;
//	}

}
