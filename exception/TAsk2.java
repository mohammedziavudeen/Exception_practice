package exception;

import java.io.*;

public class TAsk2 {

	public static void main(String[] args)throws IOException {
		File ff =new File("/home/ziavu/Documents/Bank.java");
		Reader lens = new FileReader(ff);

		  int no = lens.read();
		  int charCount = 0; 
		  int wordCount = 0; 
		  int sentenceCount = 0; 
		  while(no!=-1) {
		  char ch = (char) no; 
		  //System.out.print (ch);
		  charCount++; 
		  if(ch==' ')
		    wordCount++; 
		  if(ch=='.')
		    sentenceCount++;
		  no = lens.read();
		  
		  }
		  System.out.println(charCount);
		  System.out.println(sentenceCount);
		  

	}

}
