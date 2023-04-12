package exception;

public class PasswordException extends RuntimeException  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			checkPassword("43f34134");
	}
private static void checkPassword(String pwd) {//throws PasswordException {
		// TODO Auto-generated method stub
		if(pwd.length()<8)
		{
			PasswordException pe = new PasswordException();
			throw pe;
		}	
	}
}
