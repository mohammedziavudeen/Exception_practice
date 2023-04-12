package exception;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class File1  {

	public static void main(String[] args) throws IOException  {
//		File obj=new File("/home/ziavu/Documents/doubt");
//	
//		try {
//			if(obj.createNewFile()){
//				System.out.println(obj.createNewFile());
//			}
//			else {
//				System.out.println(obj.createNewFile());
//			}
//			
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		//method1();
		//method();
		//method2();
		method4();
//		File ff =new File("/home/ziavu/Documents/erg/rr/rge/rgr/");
//		ff.mkdir();
//			try {
//				ff.createNewFile();
//				System.out.println("created");
//			}
//			catch(Exception e) {
//				System.out.println("dc");
//			}
//	}
//		//method3();//writtng content in a file
	

	//private static void sample() throws IOException {
		
		
	}	
	

	private static void method4() throws IOException    {
		File ff = new File("/home/ziavu/Music/dhinakaran.txt");
		FileWriter pen = new FileWriter("/home/ziavu/Music/dhinakaran.txt");
		BufferedWriter bWriter = new BufferedWriter(pen);
		pen.write("\n");
		pen.write("payilagam muthu); 
		pen.write("\n");
		pen.flush(); 
		pen.close();
		
	}

	private static void method3() throws IOException  {

		File ff = new File("/home/ziavu/Documents/ziavu.txt");
		FileWriter pen = new FileWriter("/home/ziavu/Documents/ziavu.txt");
		FileWriter pen = new FileWriter(pen, true);
		pen.write("karuppasamy I like you"); 
		pen.flush(); 
		pen.close();
		
	}

	private static void method2() {
		  File ff = new File("/home/ziavu/Documents/scdsc");
		  //System.out.println(ff);
		  System.out.println(ff.isFile()); 
		  ff.mkdir();
		  System.out.println(ff.isDirectory());
		  File[] files =   ff.listFiles();
		  for(int i=0;i<files.length;i++)
		  {
		    if(files[i].isFile())
		    System.out.println(files[i]);
		  }	
	}

	private static void method1() {
		File ff = new File("/home/ziavu/Downloads");
		String[] ar = ff.list(); 
		 for(int i=0;i<ar.length;i++) {
			 String name=ar[i];
			 //int len=name.length();
			 String s=name.substring(name.length()-4,name.length());
			 if(s.equals(".pdf")) {
				// System.out.println("pdf file");
				 System.out.println(name+" ");
			 }
			 
		 }
		
	}

	private static void method() {
		File ff = new File("/home/muthu/Music/dhinakaran.txt");
		//System.out.println(ff.createNewFile());
		//ff.mkdir();
		//ff.mkdirs();
		//System.out.println(ff.exists());
		//System.out.println(ff.getName());
		
	}
		
		

	}

