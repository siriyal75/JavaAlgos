import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeSample {

	public static void main(String[] args) {

		/*
		 * // 1.Fibonacci --> 1,1,2,3,5,8,13 int max = 12; for (int fib = 1; fib <= max;
		 * fib++) { // System.out.println(fibonacci(fib));
		 * 
		 * }
		 * 
		 * for (int cnt = 1; cnt < 100; cnt++) { if(getPrime(cnt)) {
		 * //System.out.println(cnt + " is Prime Number -> " + getPrime(cnt)); } }
		 * 
		 * for( int i=100; i<1000; i++) { if (checkPoly(i)) { //System.out.println(i +
		 * " is Prime Number -> " + checkPoly(i)); } }
		 * 
		 * //System.out.println("cooc is ployndrome ->" + polyCheck("coocc"));
		 * 
		 * // Factorial of a number. for (double cnt = 1; cnt <= 100; cnt++) {
		 * //System.out.println("Factorial of " + cnt + "is -> " +getFactor(cnt)); }
		 * 
		 * //Reverse String
		 * 
		 * //System.out.println(getReverse("Siriyal Reddy Eesari"));
		 * //System.out.println(getReverseSBL("Siriyal Reddy Eesari"));
		 * //System.out.println(getReverseSB("Siriyal Reddy Eesari"));
		 * 
		 * 
		 * //Remove duplicates Array. int[] arrs = {1,2,1,4,5,5,6,7,7,7};
		 * //System.out.println(Arrays.toString(removeDups(arrs)));
		 * 
		 * //Print patter increments..
		 * 
		 * 
		 * printTriangle(10); printPyramid(10);
		 * 
		 * 
		 * //Greatest Common Factor
		 * 
		 * System.out.println(getGCD(10,54)); System.out.println(getGCD(13,1001));
		 * System.out.println(getGCD(17,55467));
		 

		String[] names = { "Java", "Programming", "is", "Fun", "Enjoy" };
		System.out.println(Arrays.toString(reverseArr(names)));
		
		System.out.println(reverseWords("Java Programming is Fun"));
		
		System.out.println( isLeapYear(1900));
		
		*/
		
		int[] input = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(getBinaryIndex(input,7));
		
		

	}

	public static int getFibo(int num) {
		int temp1 = 1;
		int temp2 = 1;
		int fibo = 1;
		if (num == 1 || num == 2) {
			return 1;
		}

		for (int i = 3; i <= num; i++) {
			fibo = temp1 + temp2;
			temp1 = temp2;
			temp2 = fibo;
		}
		return fibo;
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);

		// tail recursion }
	}

	// 2.Prime number check --> 1,2,3,5,7,13...

	public static boolean getPrime(int numPol) {

		int sqr = (int) Math.sqrt(numPol) + 1;
		for (int i = 2; i < sqr; i++) {
			if (numPol % i == 0) {
				return false;
			}
		}
		return true;

	}

	// 3. Number Polyndrome check

	public static boolean checkPoly(int polyNum) {

		int polindrome = polyNum;
		int temp = 0;

		while (polindrome != 0) {

			int rem = polindrome % 10; // 121, 1221
			temp = temp * 10 + rem;
			polindrome = polindrome / 10;

		}

		if (polyNum == temp) {
			return true;
		}

		return false;

	}

	// 4 String Polyndrome check.

	public static boolean polyCheck(String pol) {

		if (pol.length() == 0 || pol.length() == 1) {
			return true;
		}

		if (pol.charAt(0) == pol.charAt(pol.length() - 1))
			return polyCheck(pol.substring(1, pol.length() - 1));

		return false;

	}

	// 5. Factorial --> 5 = 5*4*3*2*1

	public static double getFactor(double factNum) {

		if (factNum == 0 || factNum == 1 || factNum == 2) {
			return factNum;
		}

		return factNum * getFactor(factNum - 1);
	}

	// 6. String reverse --> Siriyal --> layiriS

	public static String getReverse(String src) {

		String temp = "";
		if (src == null || src.isEmpty()) {
			return src;
		}

		for (int cnt = src.length(); cnt > 0; cnt--) {
			temp = temp + src.charAt(cnt - 1);
		}
		return temp;
	}

	public static String getReverseSBL(String src) {

		StringBuilder sb = new StringBuilder(src);
		return sb.reverse().toString();
	}

	public static String getReverseSB(String src) {
		StringBuffer sb = new StringBuffer(src);
		return sb.reverse().toString();
	}

	// 7 Remove duplicates from array

	public static int[] removeDups(int[] arr) {

		Arrays.sort(arr);

		int prev = arr[0];
		int[] temp = new int[arr.length];
		temp[0] = prev;

		for (int cnt = 1; cnt < arr.length; cnt++) {

			if (prev != arr[cnt]) {
				temp[cnt] = arr[cnt];
			}

			prev = arr[cnt];
		}

		return temp;

	}

	// 8 Print patterns
	public static void printTriangle(int cnt) {

		for (int i = 0; i <= cnt; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("^");
			}
			System.out.println();
		}

	}

	public static void printPyramid(int cnt) {

		for (int i = 0; i <= cnt; i++) {
			for (int j = 0; j < cnt - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("^ ");
			}
			System.out.println();
		}

		for (int i = 0; i <= cnt; i++) {
			for (int j = 0; j < cnt - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	// 9. Greatest Common denominator

	public static int getGCD(int a, int b) {

		if (b == 0) {
			return a;
		}

		return getGCD(b, a % b);
	}

// 10. Array reverse
	public static String[] reverseArr(String[] srcArr) {

		String temp;

		if (srcArr.length < 2 || srcArr == null) {
			return srcArr;
		}

		for (int i = 0; i < (srcArr.length) / 2; i++) {
			temp = srcArr[i];
			srcArr[i] = srcArr[srcArr.length - 1 - i];
			srcArr[srcArr.length - 1 - i] = temp;
		}

		return srcArr;
	}

	// Words in a String reverse.

	public static String getRevWords(String inpString) {
		
	List<String> lstWords = Arrays.asList(inpString.split("\\s"));
	Collections.reverse(lstWords);
	
	StringBuilder sb = new StringBuilder(inpString.length());
	for(int cnt=lstWords.size()-1;cnt>=0;cnt--) {
		sb.append(lstWords.get(cnt));
		sb.append(' ');
	}
	
	return sb.toString().trim();
	
	}
	
	
	public static String reverseWords(String sentence) 
	{ 
		List< String> words = Arrays.asList(sentence.split("\\s")); 
		Collections.reverse(words); 
		/*
		StringBuilder sb = new StringBuilder(sentence.length()); 
		for (int i = words.size() - 1; i >= 0; i--) 
		{ sb.append(words.get(i)); sb.append(' '); 
		}
		*/
		return words.toString();

	}
		
	// Leap Year
	
	public static boolean isLeapYear(int year) {
		
		return (year%400==0|| (year%100 != 0 && year%4==0));
	}
		
		
	//Binary Search
	
	public static int getBinaryIndex(int[] input, int number) {
		
		int Low = 0;
		int High = input.length;
		
		while(High>=Low) {
			
			int mid = (Low+High)/2;
			System.out.println(mid);
			
			if(input[mid] == number) {
				return mid;
			}
			
			if(input[mid] < number) {
				Low = mid+1;
				
			}else if(input[mid] > number) {
				High = mid-1;
				
			}
			
		}
		
		return -1;
	}

}
