package Practical;

public class StaticMethod {
  int rollno;
  String name;
  float fee;
  static String college ="SRM";
  static void change() {
	  college="IEM";
  }
  StaticMethod(int rollno,String name,float fee){
	  this.rollno=rollno;
	  this.name=name;
	  this.fee=fee;
  }
  // method for displaying the information 
   void display() {
	   System.out.println(rollno+ " " +name+ " " +fee+ " " +college);
   }
   // now class inside a class 
   
   class StaticMethod1{
	   public static void main(String[] args) {
		   StaticMethod s1=new StaticMethod(11,"Prithula",90000);
		   StaticMethod s2=new StaticMethod(44,"Angshu",80000);
		   StaticMethod.change();
s1.display();
s2.display();
	   }
   }
}
