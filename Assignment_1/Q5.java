package Assignment_1;
import java.util.*;
public class Q5 
{
 public static void main(String[] args) 
 {
	 //Smallest positive missing number in an array using an iterative approach:
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int n=obj.nextInt();
     int[] arr=new int [n];//Creating an array of n size        
     System.out.println("enter the numbers in the array");
     for (int i = 0; i <n; i++)
         arr[i]=obj.nextInt(); //taking all input in the array]
     boolean found;  
     for (int i = 1;; i++) 
     {
         found = false;
         for (int j = 0; j < n; j++) {
             if (arr[j] == i) 
             {
             found = true;
             break;
             }    
         }
         if (found==false)
             {
             System.out.println("Missing smallest positive number is "+i);
             break;
             }
     }
           
 }
}