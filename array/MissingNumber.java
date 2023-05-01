package array;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {4,2,1,6,3,7,1,8,9};
		boolean[] appeared=new boolean[a.length];
		boolean[] appeared1=new boolean[b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					appeared1[j]=true;
					appeared[i]=true;
				}
			}
		}
		for(int i=0;i<appeared1.length;i++) {
			if(appeared1[i]==false) {
				System.out.println(b[i]);
			}
		}
		
		
		
		

	}

}
