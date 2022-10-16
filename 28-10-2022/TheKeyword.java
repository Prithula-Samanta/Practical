package Practical;

public class TheKeyword {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  TheKeyword(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
//	  rollno=rollno;
//	  name=name;
//	  fee=fee;
	  // with out this the output will be default value 
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   public class Test{
	   public static void main(String[] args) {
		   TheKeyword s1=new TheKeyword(111,"Devid",50000);
		   TheKeyword s2=new TheKeyword(222,"Binod",80000);
s1.display();
s2.display();
	   }
   }
}