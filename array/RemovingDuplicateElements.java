package array;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		int[] values= {5,5,2,2,7,5,2,6,6,1,1,1,4,4};
		boolean[] appeared=new boolean[values.length];
		int sum=0;
		for(int j=0;j<values.length;j++) {
			int count=0;
			if(appeared[j]==false) {
				//appeared[j]=true;			
				for(int i=j+1;i<values.length;i++) {
					if(values[j]==values[i]) {
						count++;				
						appeared[i]=true;
					}
				}sum=sum+count;
			}
		} System.out.println(sum);
		int[] result=new int[values.length-sum];
		boolean[] appeared1=new boolean[values.length];
		for(int j=0;j<values.length;j++) {
			if(appeared1[j]==false) {
				//appeared1[j]=true;	
				for(int i=j+1;i<values.length;i++) {
					if(values[j]==values[i]) {
						appeared1[i]=true;
						
					}
				}
			}						
		}int j=0;
		for(int i=0;i<values.length;i++) {
			if(appeared1[i]==false) { 
				result[j]=values[i];
				System.out.println(result[j]);
				j++;
			}
		}
		
		

	}

}
