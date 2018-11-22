import java.text.DecimalFormat;

public class Sample {

	public static void main(String[] args) {
		
		printPyramid(5);
		
		
	}

	public static void printPyramid(int n) {
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}

}
