import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(rotateArray(A,4)));
		
		System.out.println(Arrays.toString(bubbleRotate(A,7)));
		System.out.println(Arrays.toString(bubbleRotate(A,14)));
		System.out.println(Arrays.toString(bubbleRotate(A,10)));

	}

	public static int[] rotateArray(int[] inpArr, int k) {
		int[] tempArr = new int[inpArr.length];
		int start = inpArr.length%k;
		int j=k-1;
		for(int i=inpArr.length-1;i>=start;i--) {
			
			tempArr[j] = inpArr[i];
			j--;
			System.out.println(inpArr[i]);
			
		}
		System.arraycopy(inpArr, 0, tempArr, k-1, k-1);
		
		return tempArr;
	}
	
	public static int[] bubbleRotate(int[] inpArr, int k) {

		int temp = 0;
		for (int i = 0; i < k; i++) {
			for (int j = inpArr.length - 1; j > 0; j--) {
				
				temp = inpArr[j];
				inpArr[j] = inpArr[j-1];
				inpArr[j-1] = temp;
			}
		}
		return inpArr;
	}

}
