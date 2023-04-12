package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Task2 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("/home/ziavu/Downloads/Sta.webp");
		//Pictures/1.jpeg");
		File file = new File("/home/ziavu/Downloads/saravana.jpeg");
		FileOutputStream fos = new FileOutputStream(file);
		int no = fis.read(); 
		while(no!=-1)
		{
		  fos.write(no); 
		  no = fis.read();
		}
		fos.flush();
		fos.close();

	}

}
