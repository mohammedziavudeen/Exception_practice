package exception;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class Reader {

	public static void main(String[] args)throws Exception {
		File ff = new File("/home/ziavu/Music/ziavudeen.txt");
		FileReader lens = new FileReader(ff);
		BufferedReader bReader = new BufferedReader(lens);
		String s = bReader.readLine(); 

		  while(!s.equals(null)) {
		  
		  System.out.print (s);
		  s = bReader.readLine();
		  
		  }

	}

}
