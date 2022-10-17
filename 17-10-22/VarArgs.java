package Practical;

public class VarArgs {
  public void myMethod(String...text) {
	  System.out.println("Hello Prithula this is"
	  		+ " a method here we use"
	  		+ " variable argument ");
	  for(String str:text) {
		  System.out.println(str);
	  }
	  
  }
  public static void main(String[] args) {
	  VarArgs obj =  new VarArgs();
	obj.myMethod(); //  zero argument no problem run successfully 
//	System.out.println("The texts are : ");
	obj.myMethod("Ram","Prithula","Shyam");
//	System.out.println("The texts are : ");

	obj.myMethod("Ram","Prithula","Shyam","Binod","Abhishek","Nila","Sayani","Ronita");  // that means we assign any no of argument 
  }
}