package stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchParenthesisDemo {

	private static final Map<Character, Character> matchingParenMap = new HashMap<>();
	private static final Set<Character> openingParenSet = new HashSet<>();

	static {
		matchingParenMap.put(')', '(');
		matchingParenMap.put(']', '[');
		matchingParenMap.put('}', '{');
		openingParenSet.addAll(matchingParenMap.values());
	}

	/* O(n) complexity to complete this */
	public static boolean hasMatchingParens(String input) throws Exception {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (openingParenSet.contains(c)) {
				stack.push(c);
			}
			if (matchingParenMap.containsKey(c)) {
				char lastParen = stack.pop();
				if (lastParen != matchingParenMap.get(c))
					return false;
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		String input = "[ABC](XYZ}[{MNO}PQR]";

		boolean isMatch = hasMatchingParens(input);
		System.out.println(isMatch);
	}

}
