package string;

public class CountEachCharInString {

	public static void main(String[] args) {
		String name="malayalam";
		char[] ar=name.toCharArray();
		boolean appeared[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			int count=0;
			if(appeared[i]==false) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					appeared[j]=true;
					count++;
				}
			}System.out.println("count of "+ar[i]+" = "+count);
		}

	}
	}


	
}