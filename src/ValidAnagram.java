import java.util.Arrays;


public class ValidAnagram {
	
	public static void main(String[] args) {
		String s = "cat";
		String t = "rat";
		System.out.println(isAnagram(s, t));
		String s1 = "acbd";
		String t1 = "dabc";
		System.out.println(isAnagram(s1, t1));
	}
	
	public static boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		return String.valueOf(sArr).equals(String.valueOf(tArr));
		
	}

}
