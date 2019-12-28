package defaultpackage;

//What this extends keyword?
//This is called inheritance it inherits the methods and variables from Example2.
//So if you see extends keyword it means there is an inheritance relationship here.
//Usually example1 bottom class the one it extends(Example2) is called the super class.
public class Example1 extends Example2 {
	
	String name;
	//So this is a polymorphism.
	//There are two polymorphism.
	//1 - Overloading(One method could be same name an other method but with different parameters)
	//2 - Overriding
	
	public void sayMyName() {
		System.out.println("Heisenberg!");
	}
	
	public void sayMyName(String name) { 
		System.out.println("My name is" + name);
	}
	//And this is a overriding.It takes this one instead of the other one.
	public void sayHi() { 
		
	}
	
	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.sayHi();
		Example3 e3 = new Example3();
		e3.setFlavor("Beef");
		System.out.println(e3.getFlavor());
	}
	
}
