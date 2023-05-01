package practice;

public class SelectionSOrt {

	public static void main(String[] args) {
		int[] a= {54,78,31,62,47,92};
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}	
			}
			int small=a[index];
			a[index]=a[i];
			a[i]=small;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
