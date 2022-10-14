import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
		char[] chars = new char[number.length() - k];
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
				stack.pop();
			}
			stack.push(c);
		}

		for (int i = 0; i < chars.length; i++) {
			chars[i] = stack.get(i);
		}

		return new String(chars);
	}
}