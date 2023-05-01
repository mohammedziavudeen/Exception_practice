package array;

public class ZiavudeenArray{

	public static void main(String[] args) {
		ZiavudeenArray obj = new ZiavudeenArray();
		obj.method();

	}

	private void method() {
		int num[]= {56,22};
		//int n=num[0];//boolean repeated=false;
		//for(int j=0;repeated==false;j++) { old
			int j=0;
			for(;j<num.length;j++) {
			int first=num[j];
			boolean nonre=false;
			for(int i=j+1;i<num.length;i++) {	
				if(first==num[i]) {
					//System.out.println(first);old
					//repeated=true;old
					//System.out.println(first);
					nonre=true;
					break;					
					//break;old
				}
			}
			if(nonre==false) {
				System.out.println(nonre);
			}
//			if(==false) {
//				System.out.println(first);
//				break;
			}
		}
		
	}

	
	


