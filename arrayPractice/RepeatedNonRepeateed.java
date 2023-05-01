package arrayPractice;
public class RepeatedNonRepeateed {
	public static void main(String[] args) {
		int[] ar= {2,4,6,3,4,2,4,6,7,8,9,3,4,2,5,6,7,1000};
		boolean app[]=new boolean[ar.length];
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
				if(count==1) {
					//System.out.println("Non repeated element = "+ar[i]);
				}
				if(app[i]==false) {
					System.out.println("repeated element"+ar[i]);
				}
			}	
		}
	}
}