package exception;

import java.io.ObjectInputStream.GetField;

public class FindingNum {

	public static void main(String[] args) {
		String s = "sasi sasi@gmail.com 9898123456 saravanana";
	    String[] s2 = s.split(" ");
	    for(int i=0;i<s2.length;i++)
	    {
	     // System.out.println(s2[i]);
	      if(s2[i].length()==10)
	      {
	        String ss = s2[i];
	        System.out.println(ss);
	        System.out.println(ss.length());
	        try {
	        long mobile = Long.parseLong(ss);
	        System.out.println(mobile);
	        }
	        catch(NumberFormatException nef)
	        {
	          nef.printStackTrace();
	          System.out.println();
	        }
	      }
	    }
	    }
	}