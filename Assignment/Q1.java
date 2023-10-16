package Assignment;
public class Q1 {

	public static void main(String[] args) 
	{
		// TODO SUM OF NATURAL NUMBERS
		System.out.println(recurSum(5));
	}
	   public static int recurSum(int n) 
	    { 
	        if (n <= 1) 
	            return n; 
	        return n + recurSum(n - 1); 
	    } 

}
