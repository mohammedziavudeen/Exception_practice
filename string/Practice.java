package string;

public class Practice {
	//static Practice a;
	int n;
	String name;
	public Practice(int n,String name) {
		this.n=n;
		this.name=name;
	}
	public static void main(String[] args) {
//		String[] ar= {"ziavu is a good","payialagam is a good","jksbf"};
//		System.out.println(ar);
//		for(int i=0;i<ar.length;i++) {
//			System.out.println(ar[i]);
		Integer i=5;
		System.out.println(i);
			Practice mm=new Practice(12,"zia");
			System.out.println(mm);
	}
	@Override
	public String toString() {
		return "Practice [n=" + n + ", name=" + name + "]";
	}

	
}
