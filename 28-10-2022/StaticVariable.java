
package Practical;

public class StaticVariable {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  StaticVariable(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   public class StaticVariable1{
	   public static void main(String[] args) {
		   StaticVariable s1=new StaticVariable(111,"Ram",50000);
		   StaticVariable s2=new StaticVariable(222,"Shyam",80000);
s1.display();
s2.display();
	   }
   }
}