class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val deque = ArrayDeque<Int>()

        tokens.forEach { token ->
            if (token.matches("-?\\d+".toRegex())) {
                deque.addLast(token.toInt())
            } else {
                when (token) {
                    "+" -> {
                        val b = deque.removeLast()
                        val a = deque.removeLast()
                        deque.addLast(a + b)
                    }
                    "-" -> {
                        val b = deque.removeLast()
                        val a = deque.removeLast()
                        deque.addLast(a - b)
                    }
                    "/" -> {
                        val b = deque.removeLast()
                        val a = deque.removeLast()
                        deque.addLast(a / b)
                    }
                    "*" -> {
                        val b = deque.removeLast()
                        val a = deque.removeLast()
                        deque.addLast(a * b)
                    }
                }
            }
        }

        return deque.removeLast()
    }
}