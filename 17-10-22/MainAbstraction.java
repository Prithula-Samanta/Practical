package Practical;
abstract class Test1{  // class should be abstract 
	abstract void display(); // abstract method 
	void show() {
		System.out.println("no abstract method invoked ");
	}
}
class AbstractMethod extends Test1{  // first child class
	void display() {
		System.out.println("Display method invoked ");
	}
}
class Demo2 extends Test1{  // second child class 
	void display() {
		System.out.println("Demo2 method invoded");
	}
}
public class MainAbstraction {
	public static void main(String[] args) {
		Test1 obj= new AbstractMethod();
		Test1 obj2= new Demo2();

		obj.display();
		obj2.display();
		obj.show();
		obj2.show();
		
	}

}