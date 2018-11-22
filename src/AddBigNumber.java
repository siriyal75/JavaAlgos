
public class AddBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "12345234567788999900000023445555555";
		String B = "12345234567788999900000023445555555";
		System.out.println(addBigNumber(A,B));
		//System.out.println(addBigNumber(A,B));

	}

	public static String addBigNumber(String A, String B) {

		char[] chArrA = A.toCharArray();
		char[] chArrB = B.toCharArray();
		String result = "";
		int temp = 0;
		int rem = 0;
		int carry = 0;

		for (int i = chArrA.length-1; i >= 0; i--) {
			

				temp = Character.getNumericValue(chArrA[i]) + Character.getNumericValue(chArrB[i])+carry;
				if (temp >= 10) {
					rem = temp % 10;
					carry = temp / 10;
					result = rem+result;
				} else {
					result = (Character.getNumericValue(chArrA[i]) + Character.getNumericValue(chArrB[i])+carry) +result;
				}

			
		}
		return result;

	}
}
