package practice;

public class SubsetArray {

	public static void main(String[] args) {
		int[]a= {34,65,34,1,67,93};
		int b[]= {34,67,65,65};
		int count=0;
		boolean[] match=new boolean[b.length];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					match[i]=true;
					count++;
					break;
				}
			}if(match[i] ==false) {
				System.out.println("Not a subset");	
				break;
			}	
		}if(count==match.length) {
			System.out.println("It is a subset of array");
		}
	}

}
