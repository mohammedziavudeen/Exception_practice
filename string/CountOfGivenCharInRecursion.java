package string;

public class CountOfGivenCharInRecursion {
	
	public static void main(String[] args) {
		String name="ziavudeen",name2="ziavu";
		int n=name.length()-1,count =0;
		char ch='e';
		String result=method(name,n,count,ch,name2);
		System.out.println(result);
	}
	private static String method(String name, int n,int count,char ch,String name2) {
		if(ch==name.charAt(n)) {
			count++;
			//return count;
		}
		if(n==0) {
			name2="mine";
			return name2;
		}
		return name2=method(name,n-1,count,ch,name2);
	}
}