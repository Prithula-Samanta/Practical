package Practical;
import java.lang.*;   // we must import this statement 
public class ExceptionExampless {
	  public void show() {
		  String a="i am an error";
		  try {
			  int i=50/0; // Arithmetic Exception 
			  System.out.println(i);
			  String str =  "Prithula";
			  System.out.println(str.length());
			  int arr[]=new int[3];
			  arr[9]=89; // ArrayIndexOutorboundException occur here
			  int m = Integer.parseInt(a); // number format exception 
			  System.out.println(m);
			  
		  }
		  catch(Exception e) {
			  System.out.println(e);
		  }
		  String b= "i cannot be handled";
		  System.out.println(a+" "+b); // i am an error + i cannot be handled 
	  }
	  public static void main(String[] args) {
		  ExceptionExampless obj= new ExceptionExampless();
		  obj.show();
	  }
	}
