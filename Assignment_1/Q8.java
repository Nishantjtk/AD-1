package Assignment_1;
import java.util.*;
public class Q8
{
    public static void main(String[] args) 
    {
    	//print nth fibbonacci number :
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=obj.nextInt();
        int a=0,b=1,sum=1;
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("The "+n+"th fibonacci number is "+sum); 
    }
}