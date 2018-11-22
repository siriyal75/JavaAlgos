import java.util.HashSet;

public class ReverseVowels {

	public static void main(String[] args) {

		String word = "Hello World";

		System.out.println(reverseVowels(word));

	}

	public static String reverseVowels(String words) {

		HashSet<Character> vowels = new HashSet<Character>();

		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		char wArr[] = words.toCharArray();
		int j=wArr.length-1;
		int i=0;
		

		while(i<j) {

			if(!vowels.contains(wArr[i])) {
				i++;
				continue;
				
			}
			
			if(!vowels.contains(wArr[j])) {
				j--;
				continue;
			}
			
			char t = wArr[i];
			 wArr[i] =  wArr[j];
			 wArr[j] = t;
			 
			 i++;
			 j--;
		}
		return new String(wArr);
	}

}
