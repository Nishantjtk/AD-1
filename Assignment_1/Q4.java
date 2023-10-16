package Assignment_1;
import java.util.*;
public class Q4 
{
 public static void main(String[] args) 
 {
	 //Finding the laargest sum contiguous subarray using an iterative approach:
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=obj.nextInt();
     int[] arr=new int [n];//Creating an array of n size        
     System.out.println("enter the numbers in the array");
     for (int i = 0; i <n; i++)
         arr[i]=obj.nextInt(); //taking all input in the array    
     // Initialize variables to hold the maximumsum value
     int maxSum = Integer.MIN_VALUE;
     int currSum = arr[0];
     for (int i = 0; i <= n - 1; i++) 
     {
         currSum=Math.max(arr[i], currSum+arr[i]);
         if (currSum > maxSum)
             maxSum = currSum;
 
     }
     System.out.println("The maximum sum is "+maxSum);     
 }    
}