package Assignment_1;
import java.util. *;
public class Q2 
{
    public static void main(String[] args) 
    {
    	//Find maximum and minimum in an array using an iterative approach:
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int[] arr=new int [n];//Creating an array of n size        
        System.out.println("enter the numbers in the array");
        for (int i = 0; i <n; i++)
            arr[i]=obj.nextInt(); //taking all input in the array    
       
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > max)
                max = arr[i]; 
            if (arr[i] < min)
                min = arr[i]; 
        }  
        System.out.println("In the array Maximum value: " + max+" \nand Minimum value: " + min);               
    }
}