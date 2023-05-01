package arrayPractice;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] ar= {2,5,3,6,4,8,4,7};
		left_Twice(ar);
		right_twice(ar);
//		for(int i=0;i<ar.length/2;i++) {
//			int empty=ar[i];
//			ar[i]=ar[ar.length-1-i];
//			ar[ar.length-1-i]=empty;
//		}
//for(int i=0;i<ar.length;i++) {
//	System.out.print(ar[i]);
//}
int empty=ar[0];
for(int i=0;i<ar.length-1;i++) {
	ar[i]=ar[i+1];
}
ar[ar.length-1]=empty;
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]);
}System.out.println();
int emp=ar[ar.length-1];
for(int i=ar.length-1;i>0;i--) {
	ar[i]=ar[i-1];
}
ar[0]=emp;
for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]);
}System.out.println();
	}
private static void right_twice(int[] ar) {
		int emp1=ar[ar.length-1],emp2=ar[ar.length-2];
		for(int i=ar.length-1;i>1;i--) {
			ar[i]=ar[i-2];
		}
		ar[0]=emp2;ar[1]=emp1;
		System.out.println("right twice--->");
		for(int i=0;i<ar.length;i++) {
	
			System.out.print(ar[i]);
		}System.out.println();
	}


//int[] ar= {2,5,3,6,4,8,4,7};
	private static void left_Twice(int[] ar) {
		int emp1=ar[0],emp2=ar[1];
		for(int i=0;i<ar.length-2;i++) {
			ar[i]=ar[i+2];
		}
		ar[ar.length-2]=emp1;
		ar[ar.length-1]=emp2;
		System.out.println("twice--->");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}System.out.println();
	}

}
