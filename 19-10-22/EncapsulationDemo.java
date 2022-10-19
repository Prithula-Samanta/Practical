package Practical;
public class EncapsulationDemo {
private String Student_name;
private  int Student_id;
private int Password;
int total,percentage;
public String get_name()
{	return Student_name;
}
public int get_stu_id()
{

    return Student_id;	
}
public int get_Pass()
{
	return Password;
}
public void set_name(String Student_name)
{
	this.Student_name=Student_name;
}
public void set_stu_id(int Student_id)
{
	this.Student_id=Student_id;
}
public void set_pass(int Password)
{
	this.Password=Password;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public void calc(int sub1,int sub2,int sub3,int sub4,int sub5) {
total=sub1+sub2+sub3+sub4+sub5;
percentage=total/5;
if(percentage>=35 && percentage<=45) {
	System.out.println("D grade");
}
else if(percentage>=45 && percentage<=55) {
	System.out.println("C grade");
}
else if(percentage>=55 && percentage<=75) {
	System.out.println("B grade");
}
else if(percentage>=75 && percentage<=85) {
	System.out.println("A grade");
}
else if(percentage>=85 && percentage<=100) {
	System.out.println("O grade");
}
else {
	System.out.println("Fail");
}
}
}
