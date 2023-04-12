package exception;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
public class FileWritter {

	public static void main(String[] args) throws Exception{
		File ff = new File("/home/ziavu/Music/dhinakaran.txt");
		//FileWriter pen = new FileWriter("/home/muthu/Music");
		FileWriter pen = new FileWriter(ff, true);
		pen.write("ano");
		pen.write("\nbh");
		pen.flush(); 
	//	pen.close();	
		Reader lens = new FileReader(ff);
		BufferedReader bReader = new BufferedReader(lens);
		String  s = bReader.readLine(); 
	//	System.out.println(s);
		while(s!=null) {
			System.out.println(s);
			 s = bReader.readLine();
		}
 

	}

}
