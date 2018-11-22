import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {8,7,6,5,4,3,2,1};
		int[] input2 = {8,7,6,5,4,3,2,1};
		int[] input3 = {1,2,3,4,5,6,7,8};
		int[] input4 = {1,2,3,4,5,6,7,8};
		System.out.println(printBubbleSorted(input1));
		System.out.println(printBubbleSortedImp(input2));
		System.out.println(printBubbleSorted(input3));
		System.out.println(printBubbleSortedImp(input4));
		

	}
	
	public static String printBubbleSorted(int[] input) {
		int n = input.length;
		int temp;
		int count = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=0; j<n-1-i;j++) {
				if(input[j] > input[j+1]) {
					temp = input[j];
					input[j] =input[j+1];
					input[j+1] = temp;
					count++;
				} //if
				count++;
			} //j
			count++;
		}//i
		System.out.println("Loop count reg" + count);
		return Arrays.toString(input);
		
	}//bubble
	
	public static String printBubbleSortedImp(int[] input) {
		int n = input.length;
		int temp;
		boolean swapped;
		int count = 0;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0; j<n-1-i;j++) {
				if(input[j] > input[j+1]) {
					temp = input[j];
					input[j] =input[j+1];
					input[j+1] = temp;
					swapped=true;
					count++;
				} //if
				count++;
			} //j
			count++;
			if(swapped==false) break;
			
		}//i
		System.out.println("Loop count Imp" + count);
		return Arrays.toString(input);
		
	}//bubble

}
