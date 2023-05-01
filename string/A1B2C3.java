package string;
//two approaches
public class A1B2C3 {

	public static void main(String[] args) {
		String s="a1b4c5";
     
        for(int i=0;i<s.length()-1;i+=2) {
        	   int count =0;
          if(s.charAt(i+1)>='1'&&s.charAt(i+1)<='9') {
           char a=s.charAt(i+1);
           count = a - '0';
            if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
            for(int j=0;j<count;j++) {
              System.out.print(s.charAt(i));
            }
          }
          }
	}
      //  method();
	}

	private static void method() {
		 String str = "a1b2c8";
	
		for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                System.out.print(str.charAt(i));
                 
            }
            else
            {
                int x = Character.getNumericValue(str.charAt(i));
                 
                for(int j=1;j<x;j++)
                {
                    System.out.print(str.charAt(i-1));
                }       
            }
		
	}}
}
