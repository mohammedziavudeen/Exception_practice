package exception;

public class PracCatch {

	public static void main(String[] args) {
		PracCatch obj =new PracCatch();
		//obj.second();
		prac();
		
		try {
		      int[] a=new int[-5];
		    } 
		catch (NegativeArraySizeException aq) {
		      System.out.println("nega");
		      //aq.printStackTrace();
		    }

	}
	private static void prac() {
		try  
        {  
			int[] ar=new int[-4];
			try {
				int[] ar1=new int[-4];
			}
			catch(Exception w){
				System.out.println("yyj");
			}
	
       //may throw exception   
        }
            //handling the exception  
        
		catch(NegativeArraySizeException a)  
        {  
            System.out.println(a);  
        }
		catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		 catch(Exception e)  
        {  
            System.out.println(e);  
        } 
		System.out.println("hk");
		
	}
	public static void third() 
			  throws Exception{
			    
			      int no1 = 10; 
			      int no2 = 10; 
			      System.out.println(no1/no2);
			      int[] ar = new int[-no1]; 
			      System.out.println(ar.length);
			      for(int i=0;i<20; i++)
			      {
			        System.out.println(ar[i]);
			      }
			  }
	private static void second() {
	    // TODO Auto-generated method stub
	    try {
	    int no1 = 10; 
	    int no2 = 10; 
	    System.out.println(no1/no2);
	    int[] ar = new int[-no1]; 
	    System.out.println(ar.length);
	    for(int i=0;i<20; i++)
	    {
	      System.out.println(ar[i]);
	    }
	    }

	  
	    catch(ArrayIndexOutOfBoundsException aa)
	    {
	      System.out.println("Check ");
	    }
	    catch(ArithmeticException ae)
	    {
	      System.out.println("Check divisor");
	    }
	    catch(NegativeArraySizeException ai)
	    {
	      System.out.println("It is a negatice index");
	    }
	    
	    catch(Exception e)
	    {
	      System.out.println("Something went wrong");
	    }
	  }

}
