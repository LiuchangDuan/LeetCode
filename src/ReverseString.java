
public class ReverseString {
	
	public static void main(String[] args) {
		String s = new String("hello");
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {
		return new StringBuffer(s).reverse().toString();
	}

}
