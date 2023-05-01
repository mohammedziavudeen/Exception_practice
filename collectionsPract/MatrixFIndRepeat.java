package collectionsPract;

import java.util.HashSet;
import java.util.Scanner;

public class MatrixFIndRepeat {

	public static void main(String[] args) {
		int[][] ar= {{5,9,19},
				{27,5,1},
				{23,11,1}};
		HashSet s=new HashSet();
		boolean app=false;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
					boolean f=s.add(ar[i][j]);
					if(f==false) {
						System.out.println("no");
						app=true;
						break;
					}
			}
			if(app==true) 
				break;
			
		}if(app==false)
			System.out.println("Unique");
		System.out.println(s);
	}
}
