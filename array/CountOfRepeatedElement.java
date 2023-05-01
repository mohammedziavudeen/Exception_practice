package array;

public class CountOfRepeatedElement {
	public static void main(String[] args) {
		CountOfRepeatedElement obj = new CountOfRepeatedElement();
		obj.method();
	}

	private void method() {
		int[] values= {5,5,8,10,23,34,5,1,6};
		boolean[] appeared=new boolean[values.length];
		for(int j=0;j<values.length;j++) {
			int count=1;
			if(appeared[j]==false) {
				appeared[j]=true;
				
				for(int i=j+1;i<values.length;i++) {
					if(values[j]==values[i]) {
						count++;
						appeared[i]=true;
					}
				}//2nd for
				System.out.println(values[j]+" appeared "+count+" times");
			}//appeared if bracket
		}//first for closed
		
	}//method

}
