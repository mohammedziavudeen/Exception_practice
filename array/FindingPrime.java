package array;

public class FindingPrime {

	public static void main(String[] args) {
		FindingPrime obj=new FindingPrime();
		obj.method();
	}
	private void method() {
		int[] ar= {43,65,49,61,97,7};
		for(int i=0;i<ar.length;i++) {
			boolean result=prime(ar[i]);
			if (result==false){
				System.out.println(ar[i]);
			}
		}	
	}
	private boolean prime(int no) {
		boolean first=false;
		for(int div=2;div<no/2;div++) {
			if(no%div==0) {
				first=true;
				break;
		}
		}
		return first;
	}

}
