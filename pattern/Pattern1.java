package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern1 obj=new Pattern1();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
		obj.method7();
		obj.method8();
		obj.method9();
		obj.method10();
		obj.method11();
		obj.method12();
		obj.method13();
		obj.method14();
		obj.method15();
		obj.method16();
		obj.method17();
		//obj.method18();
	}
		private void method18() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}int n=5;
			for(int k=i;k>=n;k--) {
				System.out.print(k);
				System.out.println(k);
			}
			System.out.println();
		}
		
	}
		private void method17() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
		private void method16() {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}int n=5;
			for(int k=1;k<=i;k++) {
				System.out.print(n);
				n--;
			}
			System.out.println();
		}
		
	}
		private void method15() {
		for(int i=6;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=6;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		private void method14() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
		private void method13() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
		private void method12() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
		private void method11() {
			int k=5;
			for(int i=5;i>=1;i--) {
			for(int j=i;j>=k;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			k-=2;
		}
		
	}
		private void method10() {
			int n=5;
			for(int i=1;i<=5;i++) {
				
				for(int j=1;j<=i;j++) {
					System.out.print(n);
					n--;
				}System.out.println();
				//n=n-1;
			}
	}
		private void method9() {
			//int n=5;
			for(int i=1;i<=5;i++) {
				int u=9;
				for(int j=1;j<=i;j++) {
					u--;
					System.out.print(u+" ");
				}
				System.out.println(u);
			}			
	}
		private void method8() {
			
		for(int j=5;j>=1;j--) {
			for(int i=5;i>=j;i--) {
				System.out.print(i+" ");;
			}
			System.out.println();
		}
		
	}
		private void method7() {
		for(int j=1;j<6;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print(i);
			}System.out.println();
		}
		
	}
		private void method6() {
		for(int j=5;j>=1;j--) {
			for(int i=j;i>=1;i--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
		private void method5() {
		for(int j=1;j<6;j++) {
			for(int i=j;i<6;i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
		private void method4() {
		int n=15;
		for(int j=5;j>0;j--) {
			for(int i=1;i<=j;i++) {
				System.out.print(n +" ");
				n--;
			}
			System.out.println();
		}
		
	}
		private void method3() {				
		int n=5;
		for(int j=5;j>=1;j--) {				
			for(int i=1;i<=j;i++) {
				System.out.print(n*i+" ");
			
			//	n=n+5;
			}
			System.out.println();
			n--;
		}
	}
		private void method2() {
		int n=1;
		for(int j=1;j<6;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
		private void method1() {		//54321
			int n=5;			//		//5432
			for(int j=5;j>0;j--) {		//543
			for(int i=0;i<j;i++) {		//54
			System.out.print(n);		//5
			n--;
		}
			System.out.println();
			n=5;
			}
	}
}

