package collectionpractice;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
       String[] ss= {"zia","zia","ziavu","mohd","ziavu","zia","zia","mohammed","mohd"};
       HashMap<String, Integer> h = new HashMap<>();   
        for (String s : ss) {
        	if(h.containsKey(s)) {
        		h.put(s, h.get(s)+1);
        	}
        	else	
        		h.put(s, 1);
        }                        
        System.out.println(h.get("zia"));
        System.out.println(h.get(1)); 
//        System.out.println("Repeated elements: ");
        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            if (entry.getValue() ==1) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
                h.remove(entry.getKey());
               h.remove( entry.getValue());
                h.remove( entry);
            }
        }  
        String s[]= {"mohd","mohh","zia"};
        for(Map.Entry<String, Integer> entry:h.entrySet()) {
        	for(String s1:s) {
        		if(entry.getKey()=="zia") {
            		System.out.println("contains "+s1);
            	}
        	}  	
        }
       System.out.println(h.containsValue(2));;
        System.out.println(h);
    }
}