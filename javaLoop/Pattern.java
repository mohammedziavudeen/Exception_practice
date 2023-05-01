package javaLoop;
public class Pattern {
	public static void main(String[] args) {
		mehod1();
		method2();
		method3();
		method4();//88 877 8766 87655 876544
		method5();
		method6();
		method7();
		method8();
		method9();
		method10();
		method11();
		method12();
		method13();//pyramid
		method14();
	}
	private static void method14() {
		int n=1;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				if(i+j==6) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}System.out.print("*");
			System.out.println();
		}	
	}
	private static void method13() {
		for(int i=5,p=1;i>=1;i--,p++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(p);
			}
			for(int m=1;m<p;m++) {
				System.out.print(p);
			}
			System.out.println();
		}
//		for(int i=4,p=4;i>=1;i--,p--) {
//			for(int j=4;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(p);
//			}
//			for(int m=1;m<i;m++) {
//				System.out.print(p);
//			}System.out.println();
//		}
		
	}
	private static void method12() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}System.out.println();
		}
		
	}
	private static void method11() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	private static void method10() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}System.out.println();
		}
		
	}

	private static void method9() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}int n=5;
			for(int k=1;k<=i;k++) {
				System.out.print(n);
				n--;
			}System.out.println();
		}
		
	}

	private static void method8() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print(k);
			}System.out.println();
		}
		
	}

	private static void method7() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}int n=1;
			for(int k=5;k>=i;k--) {
				System.out.print(n+" ");
				n--;
			}System.out.println();
		}
		
	}

	private static void method6() {
		for(int i=5;i>=1;i--) {
			int n=i;
			for(int j=5;j>=i;j--) {
				System.out.print(n+" ");
				n--;
			}System.out.println();
		
		}
		
	}

	private static void method5() {
		 int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n--;
			}System.out.println();
		}
		
	}

	private static void method4() {
		for(int i=1;i<=5;i++) {
			int u=9;
			for(int j=1;j<=i;j++) {
				u--;
				System.out.print(u+" ");
			}
			System.out.println(u);
		}
		
	}

	private static void method2() {
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
		
	}
	private static  void method3() {
		
	for(int j=5;j>=1;j--) {
		for(int i=5;i>=j;i--) {
			System.out.print(i+" ");;
		}
		System.out.println();
	}
	
}
	private static void mehod1() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}System.out.println();
		}
		
	}
}