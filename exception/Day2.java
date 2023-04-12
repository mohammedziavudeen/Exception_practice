package exception;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
public class Day2 {

	public static void main(String[] args) throws IOException {
		File ff =new File("/home/ziavu/Documents/Bank.java");
		FileReader lens = new FileReader(ff);
		int no = lens.read();
		while(no!=-1) {
		char ch = (char) no; 
		System.out.print (ch);
		no = lens.read();
		}

	}

}
