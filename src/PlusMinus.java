import java.text.DecimalFormat;

public class PlusMinus {

	public static void main(String[] args) {
		
		int[] ar = {-4 ,3, -9, 0 ,4 ,1  };
		printPlusMinus(ar);
		
		
	}

	public static void printPlusMinus(int[] ar) {
		
		int p=0;
		int n=0;
		int z=0;
		for(int i=0; i<ar.length;i++) {
			if(ar[i] < 0) {
				n++;
			}else if(ar[i] > 0) {
				p++;
			}else {
				z++;
				
			}
		}
		System.out.println(p +" "+ n+" " +z);
		
		
		System.out.printf(" Positive numbers fraction : %.4f\n", (float) p/ar.length);
		System.out.printf(" Negative numbers fraction : %.6f\n" ,  (float) n/ar.length);
		System.out.printf(" Zeros  fraction : %.6f" , (float) z/ar.length);
		
		
	}

}
