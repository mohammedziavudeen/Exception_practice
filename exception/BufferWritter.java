package exception;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.Reader;
public class BufferWritter {

	public static void main(String[] args)throws Exception {
		File ff = new File("/home/ziavu/Music/dhinakaran.txt");
		ff.createNewFile();
		Writer pen = new FileWriter("/home/ziavu/Music/dhinakaran.txt",false);
		BufferedWriter bWriter = new BufferedWriter(pen);
		bWriter.write("ftyfy zi");
		bWriter.newLine();
		bWriter.write("ftyfy ziav");
		bWriter.flush();
		Reader lens=new FileReader("/home/ziavu/Music/dhinakaran.txt");
		BufferedReader bRead=new BufferedReader(lens);
		String s=bRead.readLine();
//		int n=lens.read();
//		while(n!=0) {
//			
//		}
		for(;s!=null;) {
			int count=1;
			System.out.println(s);
			char[] ch=s.toCharArray();
			
			s=bRead.readLine();
		}
	}

}
