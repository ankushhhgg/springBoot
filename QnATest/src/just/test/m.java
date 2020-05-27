package just.test;

import java.time.Period;


public class m {

    public static void main(String[] args) {
        A obj1 = new A();
//        B obj2 = (B)obj1;
//        obj2.print();
        char c=49;
        char c2='1';
        int i=49;
        int aaa=1&3;
        		int i2='1';
        System.out.println(c+" "+c2+" " +i+" "+i2);
        System.out.println(c==i);
        System.out.println(c==i2);
        System.out.println(c==c2);
        i=c;
//        c2=i2;
        System.out.println((int)c2);
        StringBuilder builder=new StringBuilder("hi");
        StringBuilder builder2=new StringBuilder("hi");
        System.out.println(builder.toString().equals(builder2.toString()));
        System.out.println(builder.toString()==builder2.toString());
        System.out.println(" ".trim().isEmpty());
 
        final String ss="a";
        final String ss2="a";
        final int is=10;
        System.out.println((ss+ss2+is=="aa10"));
        
        Integer integer=5;
        Double double2=null;
        double dd=10;
        
            Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
            System.out.println(period);
    }

}


 class A {
	 int i;
     public void print() {
         System.out.println("A");
     }
}


//B.java
 
 class B extends A {
	 int i;
     public void print() {
         System.out.println("B");
     }
     
     public void print2() {
         System.out.println("B");
     }
}


//Test.java
 
 
