import java.util.Stack;

public class Application {
	public static void main(String[] args) {
		System.out.println(isPalindrome("Racecar"));
		System.out.println(isPalindrome("Race car"));
		
		System.out.println(isPalindrom3("Racecar"));
		System.out.println(isPalindrom3("Race car"));

	}
	
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
	
	private static boolean isPalindrom3(String str) { // Why use a stack for this?
		StringBuilder sb = new StringBuilder();
		for (int i=str.length()-1; i > -1; i--) {
			sb.append(str.charAt(i));
		}
		return str.equalsIgnoreCase(sb.toString());
	}
}
