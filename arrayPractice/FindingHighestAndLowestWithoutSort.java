package arrayPractice;

public class FindingHighestAndLowestWithoutSort {

	public static void main(String[] args) {
		int[] ar= {60,30,50,20,70,90,10,40};
		int fh=0,sh=0,fs=ar[0],ss=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(fh<ar[i]) {
				sh=fh;
				fh=ar[i];
			}
			else if(sh<ar[i]) {
				sh=ar[i];
			}
			if(fs>ar[i]) {
				ss=fs;
				fs=ar[i];
			}
			else if(ss>ar[i]) {
				ss=ar[i];
			}
		}System.out.println("frst="+fh+" "+"second="+sh);
		System.out.println("frst="+fs+" "+"second="+ss);

	}

}
