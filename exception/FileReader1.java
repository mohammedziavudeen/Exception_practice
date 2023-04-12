package exception;
import java.io.FileReader;
import java.io.File;
import java.io.Reader;

public class FileReader1 {

	public static void main(String[] args) throws Exception{
		//File ff = new File("/home/ziavu/Music/ziavudeen.txt");
		FileReader lens = new FileReader("/home/ziavu/Music/ziavudeen.txt");
		int count=0;
		int no = lens.read();
		while(no!=-1) {
		char ch = (char) no; 
		System.out.print (ch);
		count++;
		no = lens.read();
		} 
		System.out.println(count);
	}
}

