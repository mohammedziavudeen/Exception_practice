package array;


public class PlacingArrayInlastIndex {

	public static void main(String[] args) {
		int[] num= {76,35,64,35,74,55};
		int no=77;
		int i =0;
		int[] result=new int[num.length+1];
		for(;i<num.length;i++) {
			result[i]=num[i];
		}
		result[i]=no;
		for(int j=0;j<result.length;j++) {
			System.out.println(result[j]);
		}
		

	}

}
