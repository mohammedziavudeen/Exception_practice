package array;

public class CountArray {

	public static void main(String[] args) {
		CountArray obj = new CountArray();
		obj.met();

	}

	private void met() {
		int ar[]= {22,65,86,56,86,76};
		int same=86,count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==same) {
				count++;
				System.out.println("index of an "+same +" ="+i);
			}
		}
		System.out.println("no of times printes"+count);
		
	}

}
