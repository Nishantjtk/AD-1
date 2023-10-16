package Assignment_1;
import java.util.*;
public class Q7 
{
 public static void main(String[] args) 
 {
	 //Factorial of a number by using an iterative approach:
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=obj.nextInt();
     int fact=1;
     while(n>0)
     {
         fact*=n;
         n--;
     }
     System.out.println("The factorial is "+fact);
 }
}