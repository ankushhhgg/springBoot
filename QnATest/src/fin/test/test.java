package fin.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(5);
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list.subList(1,1));
		int [] arr=new int [5];
		System.out.println(arr.length);
		System.out.println(list.indexOf(1d));
		
		System.out.println(list.remove("na"));
		System.out.println(list.contains("na"));
	}
	
}


class StringTest{
 static char c;
	public static void main(String[] args) {
		final StringBuffer buffer1=new StringBuffer(100);
		final StringBuffer buffer2=new StringBuffer("hi");
//		buffer2.append(null);
		
		String str1=buffer1.toString();
		String str2=buffer2.toString();
		String str3= new String("hi").intern();
		
		System.out.println(""+(str1==str2)+c+(str2==str3)+"".isEmpty());
		
		String string="hi";
	final	String string2="h";
	final	String string3="i";
		
		System.out.println(string==(string2+string3));
		
		String string4="2";
		System.out.println("1"+string4.trim()+"1");
	
		String string5="ankush";
		System.out.println(string4.compareTo(string5));
		System.out.println(string5==string5.replace("a", "a"));
	}
}

class exceptionTest{
	@SuppressWarnings("finally")
	public static void main(String[] args)  {
		try {
			test1();
		} catch (RuntimeException|FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}finally{
			System.out.println("");
			return;
		}
	}

	private static void test3() {
		// TODO Auto-generated method stub
		
	}

	private static void test() throws Exception {

		test1();
	}

	private static void test1() throws Exception {

		throw new FileNotFoundException();
		
	}
}

class loopsTest{
	

	public static void main(String[] args) {
		
		int i=1;
		short s=1;
		byte b=1;
		char c=1;
		String ss="1";
		
		switch (c){
		
		case 'c':
			System.out.println("Hi");
		}
		
		int k=0;
		
		while(true){
			break;
		}
		
		
		if(true){
			
		}{
			do{
				
			}while(false);	
		}
		
		
		
		for (int j = 0; j < args.length; j++) {
			String string = args[j];
			
		}
		
		System.out.println("h");
		
		ankush:
		{
			
		}
	}

	private static Boolean getval() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


class wrappersTest{
	
	
	public static void main(String[] args) {

//		int i=1;
//		Integer integer1=1;
		Integer integer2=new Integer(1);
		Integer integer3=new Integer(1);
		System.out.println(integer2==integer3.intValue());
//		Integer integer4=1;
//		
//		System.out.println(System.identityHashCode(integer1));
//
//		System.out.println(System.identityHashCode(integer4));
//		System.out.println(integer4.hashCode());
//		
//		System.out.println(integer1==integer2);
//		System.out.println(integer1==integer4);
//		
//		System.out.println(integer2==integer3);
//		System.out.println(integer2==i);
//		System.out.println(integer1==i);
//		
//		System.out.println("long");
//		long l=1;
//		Long L=new Long(1);
//		Long L2=new Long(1);
//		Long L3=1l;
//		Long L4=1l;
//		System.out.println(L==L2);
//		System.out.println(L==L3);
//		System.out.println(L4==L3);
//		System.out.println(L2==l);
//		System.out.println(L3==l);
		
		double d=1.0;
		Double double1 = new Double(1.0);
		int ii=1;
		Integer integer=new Integer(1);
		Float f=new Float(1f);
		
		ii=(int) d;
		d=ii;
		
		System.out.println(d==f);
		
		Integer integer22=new Integer(1);
//		Integer integer7=new Integer("");
//		Integer.parseInt("");
		integer.valueOf(1);
		System.out.println("integer.valueOf(1)"+integer.valueOf(1));
		integer.intValue();
		
		
		System.out.println(integer.equals(double1));;
		
		int [] intarr= new int []{1,2,3};
		int i=1;
		Double float1=new Double(1.0);
		System.out.println("i=flat"+(i==float1));
		
		intarr[i]=i=30;
		System.out.println(intarr[0]);
		
		print((int)1l);
		
		
		System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		int oo=Integer.MAX_VALUE+Integer.MAX_VALUE;
		System.out.println(oo);
		 
final 		char c=0;
		byte b=0;
		short s=0;
		final int iv=0;
		
		long lv=0x454 ;
		float fv=0f;
		final  double dv=0;
		b=iv;
		lv=iv;
		
	}

	
	
//	private static void print(int i) {
//
//	System.out.println("wrappersTest.print()");
//	}
	private static void print(int i) {
		System.out.println("wrappersTest.print()Long");
	
		
		
	}
	
	
	private static void print(Long i) {
		// TODO Auto-generated method stub
		System.out.println("wrappersTest.print()Inte");
	}
	
	private static void print(Integer i) {
		// TODO Auto-generated method stub
		System.out.println("wrappersTest.print()Integer");
	}
	
	
}


class booleanTest{
	public static void main(String[] args) {
		Boolean boolean1=new Boolean("tRuE");
		Boolean boolean2= new Boolean(true);
		boolean b=true;
		Boolean boolean3=true;
		Boolean boolean4=true;
		System.out.println(boolean1==boolean2);
		System.out.println(boolean1==boolean3);
		System.out.println(boolean4==boolean3);
		System.out.println(boolean1==b);
		System.out.println(boolean3==b);
		System.out.println(Boolean.parseBoolean("True"));
		System.out.println(Boolean.valueOf(""));
		System.out.println(boolean1==boolean2.booleanValue());
		System.out.println("booleanTest.main()");
		System.out.println(boolean3==Boolean.TRUE);
		
		System.out.println("int");
		Integer integer=new Integer(1);
		Integer integer2=1;
		System.out.println(integer==integer2);
	}
}


interface i1{
	static int dde=10;
	void disp();
	static void dispp(){};
	void disp(int k);
	
}

interface i2{
	void disp();
}

interface sss{
	static int dde=10;
	static void disps(){};
	 void dispp();
}

class tt {
	static int ddes=10;
	 int dde=10;
	static void disps(){};
	 void dispp(){};
}

class yy extends tt{
	static int dde=10;
	int ddes=10;
	 void dispp(){};
	 static void disps(){};
	 
}

class a implements i1{
	int dde=10;;
	public void dispp(){}
	protected int s=0;
	
	private static final int print(){
		return 0;
	}
	
	public boolean equals(a arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	static void method1() throws IOException,NullPointerException{
		
	}
	a(){
		
//		this(print());
	}
	 a(int i){
		 super();
	}
	 
	 static int dd=100;

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp(int k) {
		// TODO Auto-generated method stub
		
	}
}

class b extends a implements i1{

	 int dd=10;
	
	static public void method1() throws FileNotFoundException,RuntimeException{
//		System.out.println(s);
	}
	
	static int prints(){
		return 0;
	}

	
	b(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp(int k) {
		// TODO Auto-generated method stub
		
	}
	
}
abstract  class c extends b{

	 void m2(){
		 System.out.println(s);
	 }
	 
	c(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
	 
 }
 class d implements i1{
	 public void chane(){
//		 dd=89;
		 
	 }
	 
	 int gg;
	 static int gg1;
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void disp(int k) {
		// TODO Auto-generated method stub
		
	}
 }
 
 class interfaceTest implements i1,i2{

	 final static int  kll;
	 
	 
	 static{
		 kll=0;
	 }
	 public interfaceTest() {
	 }
	  
	 static void dd(){
		 System.out.println("hh");
	 }
	 @SuppressWarnings("static-access")
	public static final void main(String[] args) {
		if (true){
			
			
			i1 i1=new interfaceTest();
			i1.disp();
			interfaceTest  interfaceTest=null;
			interfaceTest.dd();
			
			int [] arr=new int [get()];
			gete()[get()]=9;
		}
	 }

	private static Object[] gete() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
		System.out.println("l");
	}

	@Override
	public void disp(int k) {
		// TODO Auto-generated method stub
		
	}
 }

 
 class ooo{
	 public static void main(String[] args) {
		System.out.println(Math.round(1.6));
	}
 }





 class quickTest{
		public static void main(String[] args) {
			int i=500000;
			Integer iw=128;
			Integer iw2=128;
			System.out.println(iw2==iw);
			
			Float f=12.0f;
			Float f2=12.0f;
			System.out.println(f==f2);
			
		}
	}
 
 
 class DateTest{
	 public static void main(String[] args) {
	LocalDate.of(2019, 1, 31);
	DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("YYYY DD MM");
	System.out.println(LocalDate.of(2019, 01, 31));
	System.out.println(LocalDate.parse("2019 01 01",dateTimeFormatter));
	;
	
	}
 }