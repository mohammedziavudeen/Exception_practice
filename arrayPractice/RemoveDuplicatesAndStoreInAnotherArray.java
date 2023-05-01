package arrayPractice;

public class RemoveDuplicatesAndStoreInAnotherArray {

	public static void main(String[] args) {
		int[] ar= {5,5,2,2,7,5,2,6,6,1,1,1,4,4,8};
		boolean[] app=new boolean[ar.length];
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(app[i]==false) {
				int count=1;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						app[i]=true;
						app[j]=true;
						count++;
					}
				}
				if(count>1)
					sum=sum+count;
			}
		}
		int non[]=new int[ar.length-sum];
		int j=0;
		for(int i=0;i<app.length;i++) {
			if(app[i]==false) {
				non[j]=ar[i];
				j++;
			}
		}
		System.out.print("The non repeated elements are-->");
		for(int i=0;i<non.length;i++) {
			System.out.print(" "+non[i]);
		}
	}
}