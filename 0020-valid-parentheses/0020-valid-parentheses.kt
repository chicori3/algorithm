class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        s.toCharArray().forEach {
            when (it) {
                '(', '{', '[' -> stack.addFirst(it)
                ')' -> {
                    if (stack.isEmpty() || stack.first() != '(') return false
                    stack.removeFirst()
                }

                '}' -> {
                    if (stack.isEmpty() || stack.first() != '{') return false
                    stack.removeFirst()
                }

                ']' -> {
                    if (stack.isEmpty() || stack.first() != '[') return false
                    stack.removeFirst()

                }
            }
        }

        return stack.isEmpty()
    }
}