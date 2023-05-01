package string;
import java.util.regex.*;
public class SpecialChar {

	public static void main(String[] args) {
		String name = " ziavu443";
        String specialCharacters = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        boolean result=false;
        for (int i=0; i < name.length() ; i++)
        {
            char ch = name.charAt(i);
            if(specialCharacters.contains(Character.toString(ch))) {
                System.out.println("contains special character");
                result=true;
                break;
            }    
           
        }if(result==false) {
        	System.out.println("no special");
        }
	}

}
