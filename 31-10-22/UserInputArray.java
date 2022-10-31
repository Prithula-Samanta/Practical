package Array;
import java.util.Scanner;
public class UserInputArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements");
int x=sc.nextInt();
int arr[]=new int[x];
System.out.println("enter the elements one by one");
for(int i=0;i<arr.length;i++)
	arr[i]=sc.nextInt();
for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);}}