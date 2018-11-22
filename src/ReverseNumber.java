
public class ReverseNumber extends CodeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getReverse(12345));
		

	}

	public static int getReverse(int number) {
		int temp=0;
		int rem=0;
		do {
			rem = number%10;
			temp = temp*10+rem;
			number = number/10;
			
		}while(number>0);
		
		return temp;
		
		
	}
	
}
