package arrayPractice;
import java.util.Arrays;
public class ArraySize {

	public static void main(String[] args) {
		int myArray[] = new int[8];
	      myArray[0] = 1254;
	      myArray[1] = 1458;
	      myArray[2] = 5687;
	      myArray[3] = 1457;
	      myArray[4] = 4554;
	      myArray[5] = 5445;
	      myArray[6] = 7524;
	      System.out.println(Arrays.toString(myArray));
	      myArray = new int[9];
	      myArray[7] = 224;
	      System.out.println(Arrays.toString(myArray));
	}

}
