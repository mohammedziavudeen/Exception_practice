package array;

public class PracticeArray {

	public static void main(String[] args) {
		PracticeArray obj=new PracticeArray();		
		obj.array();

	}

	public void array() {
		int[] marks= {88,86,89,86,91};
		int len=marks.length;
		//boolean first=true;
		for(int i=len-1;i>=0;i--) {
			System.out.println(marks[i]);
			
		}
		
	}
	}


