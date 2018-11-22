
public class ReverseWords {

	public static void main(String[] args) {

		String words ="The Sky is Blue";
		System.out.println(reverseWords(words));
		
		
	}
	
	public static String reverseWords(String words) {
		
		String tempArr[] = words.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=tempArr.length-1;i>=0;i--) {
			if(!(tempArr[i] == " ")) {
				sb.append(tempArr[i]).append(" ");
			}
		}
		
		return sb.length()==0 ? "" : sb.substring(0, sb.length()-1);
		
	}

}
