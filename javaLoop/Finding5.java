package javaLoop;

public class Finding5 {
public static void main(String[] args) {
	int n=5;
	while(n<96) {
		if(n%10==5)
			System.out.print(n+" ");
		else {
			int unit=n/10;
			if(unit==5) {
				System.out.print(n+" ");
			}
				}
		n++;
	}
}
}
