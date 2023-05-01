package array;
public class StoringNegativeArray {
    public static void main(String[] args) {
        int s1[]={12,-1,24,-4,4,-5};
        int count=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]<0){
                count++;
                System.out.println(s1[i]);
            }
        }
        int[] neg=new int[count];
        int j=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]<0){
                neg[j]=s1[i];
                j++;
            }
        }
        for(int m=0;m<neg.length;m++) {
        	System.out.println(neg[m]);
        }
       
    }
}