// wap to find the no is Armstrong or not 

public class ArmstrontNo {
	public static void main(String args[]) {
  int n=153;
  int orginal=n;
  int rem,sum=0;
  while(orginal!=0) {
	  rem=orginal%10;  
	  sum+=Math.pow(rem, 3);  // sum=sum+rem*rem*rem;
	  orginal/=10;  // orginal=orginal/10
 	  
  }
  if(n==sum) {
	  System.out.println(n+ " is Armstrong number");

    }
  else {
	  System.out.println(n+ " is not Armstrong number");
	  

  }
  }
}