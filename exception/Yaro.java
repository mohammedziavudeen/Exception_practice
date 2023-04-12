package exception;

public class Yaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "1234";
		try {
		Integer no = Integer.parseInt(username);
		System.out.println("Contains only numbers");
			try
			{
				int[] ar = new int[-5];
				System.out.println(ar.length);
			
			}
			catch(NegativeArraySizeException nn)
			{
				System.out.println(nn);
			}
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("String contains other than numbers");
		}
	}

}

