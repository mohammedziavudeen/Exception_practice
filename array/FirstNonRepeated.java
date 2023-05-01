package array;

public class FirstNonRepeated {

	public static void main(String[] args) {
		int[] values= {5,3,8,7,5,8,3,6};
		for(int j=0;j<values.length;j++) {
			int f=values[j];
			boolean repeated=false;
			for(int i=j+1;i<values.length;i++) {
				if(f!=values[i]) {
					//continue; not neccesary
				}
				else {
					repeated=true;
					break;
				}
			}if(repeated==false) {
				System.out.println(f);
				break;
			}
		}

	}

}
