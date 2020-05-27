package conceprt.test;

class Animal{
	
	public void ahi() {
		System.out.println("ahi");
	}
}
class Dog extends Animal{
	

	public void ahi() {
		
		
		System.out.println("oahi");
	}
	

	public void dhi() {
		System.out.println("dog hi");
	}
}


public class Casting {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Animal dAnimal=new Dog();
		Dog dog=new Dog();
		
		System.out.println(animal instanceof Animal);
		System.out.println(dAnimal instanceof Animal);
		System.out.println(dog instanceof Animal);
		
		
		System.out.println(animal instanceof Dog);
		System.out.println(dAnimal instanceof Dog);
		System.out.println(dog instanceof Dog);
		
		System.out.println("bc");
		
		Dog dog2= (Dog) animal; 
//		exception at runtime
		
		System.out.println("dAnimal.ahi();");
		dAnimal.ahi();
		
		
		System.out.println("((Animal)dAnimal).ahi();");
		((Animal)dAnimal).ahi();
		
		
		System.out.println("Animal aDog= (Animal) dAnimal;");
		Animal aDog= (Animal) dAnimal;
		aDog.ahi();
		
		
		Animal animal2=(Dog)aDog;
		
		
		Dog dog21= (Dog) dAnimal;
		Animal dog3= (Animal) dog;
		System.out.println("ac");
		
		System.out.println();
		

	
	}
	
}
