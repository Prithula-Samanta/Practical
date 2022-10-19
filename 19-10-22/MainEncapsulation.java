package Practical;
import java.util.Scanner;
public class MainEncapsulation {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String sname;
		 int stupass,sid;
		 int sub1,sub2,sub3,sub4,sub5;
		 // user input using scanner
		 System.out.println("Enter your name");
		 sname=sc.nextLine();
		 System.out.println("Enter your userid");
		 sid=sc.nextInt();
		 System.out.println("Enter your password");
		 stupass=sc.nextInt();
		 System.out.println("Enter marks of five subjects");
		 System.out.println("Enter the mark of sub1");
		 sub1=sc.nextInt();
		 System.out.println("Enter the mark of sub2");
		 sub2=sc.nextInt();
		 System.out.println("Enter the mark of sub3");
		 sub3=sc.nextInt();
		 System.out.println("Enter the mark of sub4");
		 sub4=sc.nextInt();
		 System.out.println("Enter the mark of sub5");
		 sub5=sc.nextInt();
		 EncapsulationDemo obj = new EncapsulationDemo();
		 obj.set_name(sname);
		 obj.set_pass(stupass);
		 obj.set_stu_id(sid);
		 System.out.println("Name "+obj. get_name());
		 System.out.println("User ID "+obj.get_stu_id());
		 System.out.println("Password "+obj. get_Pass());
		 obj.calc(sub1, sub2, sub3, sub4, sub5);
		 System.out.println("Percentage : "+obj.percentage);
		 
			}
			
		}