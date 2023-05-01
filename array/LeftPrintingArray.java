package array;

public class LeftPrintingArray {

	public static void main(String[] args) {
		int[] n= {87,45,63,64,56};
		int empty=n[0];
		int i=0;
		for(;i<n.length-1;i++) {//lenght=5,index=0,1,2,3,4
			n[i]=n[i+1];
			System.out.println(n[i]);
			
		}
		n[i]=empty;
		System.out.println(n[i]);
		//n[i]=empty;

			
		

	}

}
