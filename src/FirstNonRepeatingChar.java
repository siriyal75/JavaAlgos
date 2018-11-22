import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFirstNonRepChar("aaabbccdddeeeffgik"));
		
	}
	
	public static char getFirstNonRepChar(String input) {
		
		char[] chaArr = input.toCharArray();
		Map<Character,Integer> charCounts = new LinkedHashMap<>(input.length());
		for (char c : chaArr) {
			
			charCounts.put(c, charCounts.containsKey(c)?charCounts.get(c)+1:1);
		}
		
		for(Entry<Character,Integer> entry :charCounts.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		System.out.println("No Repeat Char found");
		return 0;
	}
	
	
}
