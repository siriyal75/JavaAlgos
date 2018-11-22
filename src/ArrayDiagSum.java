
public class ArrayDiagSum {

	public static void main(String[] args) {
		
		

		int[][] arr =  {{1, 2 ,3},{4, 5 ,6},{9 ,8 ,9 }};
        
        
        System.out.println(diagSum(arr));

	}

	public static int diagSum(int[][] ar) {
		int d1=0;
		int d2=0;
		int sum=0;
		
		int j=0;
		for(int i=0;i<ar.length;i++) {
			d1 = d1+ar[i][j];
			j++;
			
		}
		System.out.println(d1);
		j=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			d2 = d2+ar[i][j];
			
			j--;
			
		}
		
		System.out.println(d2);
		
		sum = d1-d2;
		
		
		return Math.abs(sum);
	}
}
