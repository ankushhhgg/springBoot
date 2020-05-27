package conceprt.test;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }
class Sib extends M { }

public class Tester extends Object{
	
//	public static void main(String[] args) {
//    Base obj = new Derived();
//    obj.m1();
//}

	
	
    public static void main(String args []) {
        int ss='4';
        int ss1=4;
        char cc='4';
        char cc1=52;
        
        ss=cc;
//        cc=ss1;
//        cc=ss;
        
        System.out.println("ss"+ss+"ss1"+ss1+"cc"+cc+"cc1"+cc1);
        System.out.println(ss);
    	Double d=2.0;
    	M obj = new O();
    	O obj2 = new O();
        if(obj instanceof M) 
          System.out.print("M");
        if(obj instanceof N) 
          System.out.print("N");
        if(obj instanceof O) 
          System.out.print("O");
        if(obj instanceof P) 
          System.out.print("P");
        
        if(obj instanceof Sib) 
            System.out.print("Sib");
    
    
    }

	

//    public static void main(String[] args) {
////        OTG obj = new OTG(128, "TYPE-C");
////        System.out.println(obj.capacity + ":" + obj.type);
//    	
//    	 final int aa = 5;
//         int x = 10;
//         int a=0;
//		switch(x) {
//             case aa:
//                 a *= 2;
//             case 20:
//                 a *= 3;
//             case 30:
//                 a *= 4;
//         }
//         System.out.println(a);
//    }

	

//    public static void main(String[] args) {
//        AAAA obj1 = new C();
//        AAAA obj2 = new B();
//        C obj3 = (C)obj1;
//        C obj4 = (C)obj2;
//        obj3.print();
//    }

}


 class AAAA {
     public void print() {
         System.out.println("A");
     }
}


//B.java
 
 class B extends AAAA {
     public void print() {
         System.out.println("B");
     }
}


//C.java
 
 class C extends AAAA {
     public void print() {
         System.out.println("C");
     }
}


//Test.java
 
 


class Base {
     void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
     void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}




class PenDrive {
	protected int capacity;
    PenDrive(int capacity) {
        this.capacity = capacity;
    }
}

class OTG extends PenDrive {
     String type;
    OTG(String type) {
        super(32); //default capacity
        this.type = type;
    }

    OTG(int capacity, String type) {
    	this(type);
    	
    }
    
    interface Printable {
        public void setMargin();
        public void setOrientation();
   }
    
   abstract class Paper implements Printable { //Line 7
        public void setMargin() {}
        //Line 9
   }
    
   class NewsPaper extends Paper { //Line 12
        public void setMargin() {}
        //Line 14

@Override
public void setOrientation() {
	// TODO Auto-generated method stub
	
}
   }
}

