package Practical;

public class SquareStatic {
  int a=20; // non static variable or instance variable
  static int square(int x) {
	  return x*x;
  }
  public static void main(String[] args) {
	int result = SquareStatic.square(5);
	System.out.println(result);
}
}