
public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		printPyramid(10);
		printTriangle(10);
		printPattern1(10);
		printTable(12);
		*/
		//int[] A = {2, 1, 3, 5, 3, 2};
		
		
		
		
	}
	
	public static void printPyramid(int rowCount) {
		for(int row=1; row<=rowCount; row++) {
			
			for(int j=1; j<=rowCount-row; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<row;k++) {
				System.out.print("^ ");
			}
			System.out.println("");
			
		}
		
	}
	
	public static void printTriangle(int rowCount) {
		for(int i=1; i<rowCount;i++) {
			for(int j=1; j<i; j++) {
				System.out.print("^");
			}
			
			System.out.println();
		}
	}

// Print n, n-1...1
	
	public static void printPattern1(int count) {
		
		for (int i=1; i<=count; i++) {
			for(int j=count; j>=1;j--) {
				for(int k=1; k<=count-i; k++) {
					System.out.print(j);
				}
				
			}
			System.out.println();
			
		}
	}
	
	public static void printTable(int count) {
		
		for(int i=1;i<=10;i++) {
			System.out.print(i*count);
		}
		
	}
	
	public static void printMaxofTwo(int[] A) {
		int firstMax = 0;
		int secondMax = 0;

		for (int i : A) {

			if (firstMax < i) {

				secondMax = firstMax;
				firstMax = i;
			} else if (secondMax < i) {
				secondMax = i;
			}

		}
	}
		public static void Swap(int a, int b) {

			System.out.println("Before Swap -> A value " + a + " , B value " + b);

			a = a + b; // 50
			b = a - b; // 50-30=20
			a = a - b; // 50-20=30

			System.out.println("After Swap -> A value " + a + " , B value " + b);

		}
	
}
