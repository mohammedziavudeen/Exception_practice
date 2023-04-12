package exception;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args)throws IOException {
		File ff =new File("/home/ziavu/Documents/notes");
//		ff.delete();
//		ff.exists();
		
		System.out.println(ff.isDirectory());
		//System.out.println(ff.getName());
		System.out.println(ff);
	}

}
