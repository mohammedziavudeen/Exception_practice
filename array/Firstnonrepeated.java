package array;
//first element non repeated
public class Firstnonrepeated {

	public static void main(String[] args) {
		
		int[] n= {65,69,49,80,74};
		int num=n[0];
		int i=1;
		while(i<n.length) {
			if(num==n[i]) {
				System.out.println("It is repeated");
				break;
			}
			i++;
		}
		if(i==n.length) {
			System.out.println("it is not repeated");
		}
		

	}

}
