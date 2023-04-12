package exception;
import java.io.File;
public class IsFile {
		static int count=0,count1=0;
	public static void main(String[] args) {
		File ff = new File("/home/ziavu/Documents");
		  System.out.println(ff.isFile()); 
		  System.out.println(ff.isDirectory());
		  File[] files =   ff.listFiles();
		  for(int i=0;i<files.length;i++)
		  {
		    if(files[i].isDirectory());
		  //  System.out.println(files[i]);
		    count++;
		    if(files[i].isFile())
		    	count1++;
		  }
		  //method(files);
		  System.out.println(count+" "+count1);
	}

	private static void method(File[] files) {
		for(int i=0;i<files.length;i++) {
			if(files[i].isFile()) {
				System.out.println(files[i]);
			}
		}
		
	}

}
