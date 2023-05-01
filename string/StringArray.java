package string;

public class StringArray {

	public static void main(String[] args) {
		String[] name= {"ziavu","ziavu1","mohammed","ziavu1","mohammed"};
		String name1="ziavu";
		boolean[] ar=new boolean[name.length];
		for(int i=0;i<name.length-1;i++) {
			int count=1;
			if(ar[i]==false) {
				for(int j=i+1;j<name.length;j++) {
					if(name[i]==name[j]) {
						ar[i]=true;
						count++;
					}
				}
			}
				if(ar[i]==true) {
					System.out.println(name[i]+" appeared"+count+" times");
				}
			
		
		}
//		String s1="ziavudeen";  
//		   String s2="Sachin";  
//		   String s3="Ratan";  
//		   System.out.println(s2.compareTo(s1));
//		   System.out.println(s1.compareTo(s2));//0  
//		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
//		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		//method1();

	}

	private static void method1() {
		int n=7;
		if(n<8) {
		try {
			
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		}
		
	}

}
