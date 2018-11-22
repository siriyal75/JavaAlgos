class Solution {

	
	
	public static int solution(int[] A) {
	        // write your code in Java SE 8
		// to store current array element 
        int val; 
      
        // to store next array element in 
        // current traversal 
        int nextval; 
        
        int n = A.length;
      
        for (int i = 0; i < n; i++) { 
      
            // if value is negative or greater 
            // than array size, then it cannot 
            // be marked in array. So move to 
            // next element. 
            if (A[i] <= 0 || A[i] > n) 
                continue; 
      
            val = A[i]; 
      
            // traverse the array until we 
            // reach at an element which 
            // is already marked or which 
            // could not be marked. 
            while (A[val - 1] != val) { 
                nextval = A[val - 1]; 
                A[val - 1] = val; 
                val = nextval; 
                if (val <= 0 || val > n) 
                    break; 
            } 
        } 
      
        // find first array index which is 
        // not marked which is also the 
        // smallest positive missing 
        // number. 
        for (int i = 0; i < n; i++) { 
            if (A[i] != i + 1) { 
                return i + 1; 
            } 
        } 
      
        // if all indices are marked, then 
        // smallest missing positive 
        // number is array_size + 1. 
        return n + 1; 
	}
	
	public static void main(String[] args) {
		int arr[] = { -6, -91, 1011, -100, 84, -22, 0, 1, 473 }; 
        
          
         int missing = solution(arr); 
          
        System.out.println( "The smallest positive"
                + " missing number is " + missing); 
	}
	
}
