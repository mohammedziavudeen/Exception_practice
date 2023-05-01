package arrayPractice;

public class FirstNonRepeated {

	public static void main(String[] args) {
		int[] ar= {5,3,8,7,5,8,3,6};
		boolean[] app=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(app[i]==false)
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					app[i]=true;
					app[j]=true;
					break;
				}
			}
			if(app[i]==false) {
				System.out.println(ar[i]+" is first non repeated");
				break;
			}
		}
	}

}
