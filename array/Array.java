package array;

public class Array {

	public static void main(String[] args) {
		int[] no= {1,2,3,4,5};
		String[] subject= {"english","tamil","maths","science","social"};
		int lowest=no[0];
		String sub=null;
		for(int i=1;i<no.length;i++) {
			if(no[i]>lowest) {
			lowest=no[i];
			sub=subject[i];
			//sub=subject[i];
		}
	}
		System.out.println(lowest);
		System.out.println(sub);
		}
}