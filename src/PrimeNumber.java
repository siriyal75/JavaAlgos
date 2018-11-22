
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++)
			if(isPrime(i))
			System.out.println(i + " --> " + isPrime(i));

	}

	public static boolean isPrime(int pNum) {

		if (pNum == 1 || pNum == 2)
			return true;
		for (int i = 2; i < pNum; i++) {
			if (pNum % i == 0) {
				return false;
			}
		}
		return true;

	}

}
