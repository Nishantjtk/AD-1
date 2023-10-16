package Assignment;

public class Q3 {

	public static void main(String[] args) {
		// TODO Factorial of a number 
		System.out.println(fact(7));

	}
	static int fact(int n)
	{
	 if(n==0 || n==1)
		 return 1;
	 
	   return fact(n-1)*(n);
	}

}
