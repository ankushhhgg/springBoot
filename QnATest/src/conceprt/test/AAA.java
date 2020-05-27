package conceprt.test;

public class AAA{
	
	 protected String d;
	static Double doo;
	static Double doo1;
	static Integer iii;
	static Integer iii1;
	public AAA(String d){
		this.d=d;
		
		
		
	
}
	
	public static void main(String[] args) {

		System.out.println(doo+""+doo1);
		System.out.println(iii+iii1);
		
		System.out.println(new AAA("").doo+"ooo"+new AAA("").iii);
		
	doo=null;
	}
	
	private void mian() {}
}