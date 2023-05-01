package array;

public class RemovinArray {
	public static void main(String[] args) {
		 int[] ar={8,2,8,8,65,8,3,1,8};
	      int no=8,count=0;
	      for(int i=0;i<ar.length;i++){
	          if(ar[i]==no){
	              count++;
	              			}	      
	          }
	      int[] result=new int[ar.length-count];
	      int j=0;
	      for(int i=0;i<ar.length;i++) {
	    	  if(ar[i]!=no) {
	    		  result[j]=ar[i];
	    		  System.out.println(result[j]);
	    		  j++;
	    	  }
	      }
			/*
			 * for(int i=0;i<result.length;i++) { System.out.println(result[i]); }
			 */
	      }

	}


