package just.test;

import java.util.ArrayList;
import java.util.List;

abstract public class t2 {



//   abstract void calculate();
   public static void main(String[] args){
      System.out.println("calculating");
      
      System.out.println(getArray()[2]++);
//      Calculator x = null;
//      x.calculate();
   }

private static int[] getArray() {
	// TODO Auto-generated method stub
	int i=0;
	int [] kk=new int[i=9];
	return new int[]{1,2,3};
}
}
 
 
 interface oo{
//	 int ss=10;
 }
 class t3 implements oo {
int ss;


//   abstract void calculate();
   public static void main(String[] args){
      System.out.println("calculating 2");
//      Calculator x = null;
//      x.calculate();

      Integer i=new Integer(2);
Long ll=new Long(2);
System.out.println("i.equals(ll)"+i.equals(ll));
      int ii=27/4;
      char c=49;
      System.out.println(i==ii);
      System.out.println(~9);
      System.out.println(c);
      t3 o= new t3();
      dob(1);
   System.out.println(o.ss);
   System.out.println(new Boolean("true")==new Boolean("true"));
   }


private static int dob(int d) {
	// TODO Auto-generated method stub
	return 1;
}
}
 

class AAAA{
	AAAA() {  print();   }
   void print() { System.out.println("A"); }
}
class BB extends AAAA{
   int i =   4;
   public static void main(String[] args){
      AAAA a = new BB();
      a.print();
   }
   void print() { System.out.println(i); }
}



class ParamTest {
	public static void printSum(int a, int b) {
		System.out.println("In int " + (a + b));
	}

	public static void printSum(Integer a, Integer b) {
		System.out.println("In Integer " + (a + b));
	}

	public static void printSum(double a, double b) {
		System.out.println("In double " + (a + b));
	}

	public static void main(String[] args) {
		printSum(1, 2);
	}
}

interface iii{
	void disp();
	int o=0;
}


 class SubstringTest implements iii{
//	 int o=8;
	 static int o=8;
	 
   public static void main(String args[]){
      String String = "string      g";
      System.out.println(String.substring(3, 8)+"i");
   }

@Override
public void disp() {
	// TODO Auto-generated method stub
	
}
}

class TestClass {
	static TestClass ref;
	String[] arguments;

	public static void main(String args[]) {
		int b,c;
		int a=b=c=100;
		TestClass ref = new TestClass();
		ref.func(args);
		System.out.println();
		StringBuffer  buffer=new StringBuffer();
//		buffer.c
	}

	public void func(String[] args) {
		ref.arguments = args;
	}
}


 class TestClasss {
    public static void main(String[] args) throws Exception {
        List  al = new ArrayList(); //1
//        al.add(111); //2
//        Integer i=(Integer) al.get(0);
//        System.out.println(al.get(al.size()));  //3
        float fl=0.0f;
        byte bb=9;
        System.out.println(fl==bb);
        int aa=9;
        float bbb=9f;
        System.out.println(aa==bbb);
     }
}
 
 
 


interface Account{
//  public default String getId(){
//     return "0000";
//  }
  
  public  String getId();
}

interface PremiumAccount{
	public default String getId(){
	     return "0001";
	  }
}

 class BankAccount implements Account{
  public static void main(String[] args) {
	  Account acct = new BankAccount();
      System.out.println(acct.getId());
  }

@Override
public String getId() {
	// TODO Auto-generated method stub
	return null;
}

}
