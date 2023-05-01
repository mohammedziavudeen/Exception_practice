package pattern;

public class NamePattern {

	public static void main(String[] args) {
		NamePattern obj=new NamePattern ();
		obj.method10();//M
		System.out.println(" ");
		obj.method11();//O
		System.out.println(" ");
		obj.method12();//H
		System.out.println(" ");
		obj.method3();//A
		System.out.println(" ");
		obj.method10();//M
		System.out.println(" ");
		obj.method10();//M
		System.out.println(" ");
		obj.method8();//E
		System.out.println(" ");
		obj.method6();//D
		System.out.println(" ");
		obj.method1();//Z
		System.out.println(" ");
		obj.method2();//I
		System.out.println(" ");
		obj.method3();//A
		System.out.println(" ");
		obj.method4();//V
		System.out.println(" ");
		obj.method5();//U
		System.out.println(" ");
		obj.method6();//D
		System.out.println(" ");
		obj.method8();//E
		System.out.println(" ");
		obj.method8();//E
		System.out.println(" ");
		obj.method9();//N
	
		
	}
	
	private void method12() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || col==5 || row==3){
					System.out.print("H");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method11() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				
				if(col==1|| col==5 || row==1|| row==5){
					if(row==1 && col==1 || row==1&&col==5 || row==5&&col==1 || row==5&&col==5) {
						System.out.print(" ");
					}
					else
						System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method10() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || col==5){
					System.out.print("M");
				}
				else if(col==row|| col+row==6){
					if(row<=3) {
						System.out.print("M");
					}
					else
						System.out.print(" ");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method9() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==col || col==1 || col==5){
					System.out.print("N");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method8() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==5 || col==1 || row==3 ||row==1){
					System.out.print("E");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method6() {
		for(int row=1;row<=5;row++) {
			int col;
			for(col=1;col<=5;col++) {
				if(row==5 || col==1 || col==5 ||row==1){
					System.out.print("D");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method5() {
		for(int row=1;row<=5;row++) {
			int col;
			for(col=1;col<=5;col++) {
				if(row==5 || col==1 || col==5){
					if(row==5&&col==1||row==5&&col==5) {
						System.out.print(" ");
					}
					/else
					System.out.print("u");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method4() {
		for(int row=1;row<=3;row++) {
			int col;
			for(col=1;col<=5;col++) {
				if(row==col || row+col==6){
					System.out.print("v");
				}
	
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	private void method3() {
		for(int row=1;row<=5;row++) {
			//int no=9;
			for(int col=1;col<=5;col++) {
				if(row==1 || row==3 || col==1 || col==5){
					if(row==1&&col==1||row==1&&col==5) {
						System.out.print(" ");
					}
					else {
						System.out.print("A");						
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private void method2() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1 || row==5 || col==3)
					System.out.print("i");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public void method1() {
		for(int row=1;row<=5;row++) {
			//int no=9;
			for(int col=1;col<=5;col++) {
				if(row==1 || row==5 ) {
					System.out.print("z");
				}
				else if(row+col==6)
					System.out.println("z");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
