
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i++)
			System.out.println(getFibo(i));
		for (int i = 1; i < 6; i++)
			System.out.println(getFibo2(i));

	}

	public static int getFibo(int number) {

		int temp1 = 1;
		int temp2 = 1;
		int fibo = 1;

		if (number == 1 || number == 2) {
			return 1;
		}

		for (int i = 3; i <= number; i++) {

			fibo = temp1 + temp2;
			temp1 = temp2;
			temp2 = fibo;

		}
		return fibo;

	}
	
	public static int getFibo2(int num) {
		
		if(num==1 || num==2) return 1;
		
		return getFibo2(num-1)+getFibo2(num-2);
		
	}

}
