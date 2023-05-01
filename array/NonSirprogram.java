package array;

public class NonSirprogram {

	public static void main(String[] args) {
		char[] name= {'a','a','u','n'};
		char first=name[0];
		boolean repeated=false;
		int i=1;
		while(i<name.length) {
			if(first!=name[i]) {
			break;
			}
			i++;
		}
		System.out.println(i);
		if(i==name.length) {
			System.out.println("first is non repeated "+first);
		}
	}

}
