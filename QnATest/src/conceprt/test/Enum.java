package conceprt.test;

enum A{
	D("dog");
	protected String d;
	
	A(String d){
		this.d=d;
	}
}

class AA{
	
	protected String d;
	
	AA(String d){
		this.d=d;
	}
}
public class Enum {

	public static void main(String[] args) {
		System.out.println(A.D.d);
		AA a=new AA("test");
		System.out.println(a.d);
		AAA aa=new AAA("d");
		System.out.println(aa.d);
		}
	
}
