package Assignment_2;

public class Q4 {

	public static void main(String[] args) {
		// TODO generating the nth fibonnaci
		System.out.println(fibo(5));

	}
	static int fibo(int n)
	{
	  if(n<=1)
		  return n;
	  
	   return fibo(n-2)+fibo(n-1);
	}
}


