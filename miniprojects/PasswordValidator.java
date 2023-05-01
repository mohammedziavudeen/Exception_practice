package miniprojects;
import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String name=sc.next();
		int n=name.length();
		if(8<=n) {
			//System.out.println("length matched");
			boolean space=method3(name);
			if(space==false) {
				//System.out.println("space not");
				boolean upper=method2(name);
				if(upper==true) {
					//System.out.println("upper");
					boolean lower=method1(name);
					if(lower==true) {
						//System.out.println("lower");
						boolean number=method0(name);
						if(number==true) {
							//System.out.println("number has");
							boolean special=method4(name);
							if(special==true) {
								System.out.println("Password generated successfully");
							}
							else {
								System.out.println("Password won't be generated due to absence of special char");
							}
						}
						else {
							System.out.println("Password won't be generated due to absence of integer");
						}
					}
					else {
						System.out.println("lower not");
					}
				}
				else {
					System.out.println("Due to upper case not included password mismatch");
				}
			}
			else {
				System.out.println("Due to space included password mismatch");
			}
		}
		else{
		System.out.println("Password mismatch");
		}
	}
	private static boolean method4(String name) {
		 String specialCharacters = "[A-Za-z0-9]";
	        boolean result=false;
	        for (int i=0; i < name.length() ; i++)
	        {
	            char ch = name.charAt(i);
	            if(specialCharacters.contains(Character.toString(ch))) {
	              
	                result=true;
	                break;
	            }    	           
	        }
	        return result;
	}
	 static boolean method0(String name) {
		boolean result=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0'&&name.charAt(i)<='9') {
				result=true;
			}
		}
		return result;
	}
	private static boolean method1(String name) {
		boolean result=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='a'&&name.charAt(i)<='z') {
				result=true;
			}
		}
		return result;
	}
	private static boolean method2(String name) {
		boolean result=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='A'&&name.charAt(i)<='Z') {
				result=true;
			}
		}
		return result;
	}
	private static boolean method3(String name) {
		boolean result=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ') {
				result=true;
			}
		}
		return result;
	}
}
