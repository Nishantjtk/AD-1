package Assignment_1;

import java.util.*;
public class Q1
{
 public static void main(String[] args) 
 {
	//sum of n numbers in an array using an iterative approach:
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=obj.nextInt();
     int[] arr=new int [n];//Creating an array of n size        
     System.out.println("enter the numbers in the array");
     for (int i = 0; i <n; i++)
         arr[i]=obj.nextInt(); //taking all input in the array
     int sum = 0;
     for (int i = 0; i < n; i++)
         sum += arr[i]; //Calculating the sum In the array       
     System.out.println("The sum of the numbers is: " + sum);  // Print the result
 }
}
