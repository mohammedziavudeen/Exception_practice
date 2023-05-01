package string;

public class Practices {

	public static void main(String[] args) {
		int n=9,no=90,num=8;
		String s="rfr";
		String s1=s;
		String s2=s1;
		int [] ar= {1,2,3,4};
		int[] a=me(ar);
		System.out.println(ar[1]+" "+a[1]);
		String aee[]= {"zia","efre","asmi","sha"};
		String aqq[]= {"all","stri","dc"};
		int q=m(n,no,num);
		System.out.println(q+ " "+n+" "+no);
		System.out.println(s+" "+s1+" "+s2);
		String sd=met(s,s1,s2,n,no,num);
		System.out.println(sd+" "+s1+" "+s2);
		System.err.println(q+" "+n);
		String as=new String();
	}
	
	private static int[] me(int[] ar) {
		ar[1]=10000;
		return ar;
	}

	private static int m(int n, int no, int num) {
		n=1;
		no=2;
		num=3;
		return n;
	}

	private static String met(String s, String s1, String s2, int n, int no, int num) {
		s="zia";
		s1="moh";
		n=77;
		return s;
		
	}

	

}
