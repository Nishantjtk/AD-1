package Assignment;

public class Q8 {

	public static void main(String[] args) {
		// comutting the nth power of a number

	}
	static int power(int n, int m)
	{
		if(n==0)
			return 0;
		if(m==0)
			return 1;
		
		return n*power(n,m-1);
	}

}
