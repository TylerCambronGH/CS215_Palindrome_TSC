import java.util.Stack;

/**
 * @author tylercambron
 */
public class Application {
	/**
	 * To show the palindrome check
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome("Racecar"));
		System.out.println(isPalindrome("Race car"));
	}
	
	/**
	 * Check if string is a palindrome.
	 * @param str to check for palindrome.
	 * @return a boolean stating if said string is a palindrome.
	 */
	private static boolean isPalindrome(String str) {
		Stack<Character> stringStack = new Stack<Character>();
		for (int i=0; i < str.length(); i++) {
			stringStack.add(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while (!stringStack.isEmpty()) {
			sb.append(stringStack.pop());
		}
		return str.equalsIgnoreCase(sb.toString());
 	}
}
