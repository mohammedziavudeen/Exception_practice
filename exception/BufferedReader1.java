package exception;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
public class BufferedReader1 {

	public static void main(String[] args) throws Exception{
		File ff = new File("/home/ziavu/Music/dhinakaran.txt");
		Reader lens = new FileReader(ff);
		BufferedReader bReader = new BufferedReader(lens);
		String  s = bReader.readLine(); 
	//	System.out.println(s);
		while(s!=null) {
			System.out.println(s);
			 s = bReader.readLine();
		}
//		
	}
}
