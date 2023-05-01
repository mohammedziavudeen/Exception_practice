package practice;
import java.lang.StringBuffer;
public class Practice22 {

	public static void main(String[] args) {
		StringBuffer name =new StringBuffer();
		String s ="ziai dcie";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				name.append(s.charAt(i));
			}
		}
		System.out.println(name);
	}

}
