
public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("ARMYONE","MARYONE"));

	}

	public static boolean isAnagram(String A, String B) {
		boolean chk =true;
		if(A.length() != B.length()) {
			return false;
		}
		for(int i=0; i<A.length();i++) {
			if(chk) {
			for(int j=0; j<B.length();j++) {
				if(A.charAt(i) == B.charAt(j)) {
					chk=true;
					break;
				}
				chk=false;
			}
			}
		}
		
		return chk;
	}
}
