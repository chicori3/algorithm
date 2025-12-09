class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val pairs = mapOf(')' to '(', '}' to '{', ']' to '[')

        for (char in s) {
            when (char) {
                '(', '{', '[' -> stack.addFirst(char)
                ')', '}', ']' -> {
                    if (stack.isEmpty() || stack.removeFirst() != pairs[char]) {
                        return false
                    }
                }
            }
        }

        return stack.isEmpty()
    }
}