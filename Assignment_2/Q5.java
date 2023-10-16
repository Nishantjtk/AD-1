package Assignment_2;
public class Q5 {

	public static void main(String[] args) {
		// TODO GCD of 2 number 
      System.out.println(gcd(45 , 15));
	}
	  static int gcd(int a, int b)
	    {
	        
	        if (a == 0)
	            return b;
	        if (b == 0)
	            return a;

	        if (a == b)
	            return a;

	        if (a > b)
	            return gcd(a - b, b);
	        return gcd(a, b - a);
	    }
}
