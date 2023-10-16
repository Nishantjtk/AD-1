package Assignment_2;
public class Q2 {

	public static void main(String[] args) {
		// TODO find the minimun and maximum element in an array
		 int A[] = {1, 4, 45, 6, -50, 10, 2}; 
	        int n = A.length; 
	          
	        System.out.println(findMaxRec(A, n));
	        
	        System.out.println(findMinRec(A, n));

	}
	 public static int findMinRec(int A[], int n) 
	    { 
	      if(n == 1) 
	        return A[0]; 
	          
	        return Math.min(A[n-1], findMinRec(A, n-1)); 
	    }
	 public static int findMaxRec(int A[], int n) 
	    { 
	      if(n == 1) 
	        return A[0]; 
	          
	        return Math.max(A[n-1], findMaxRec(A, n-1)); 
	    }

}

