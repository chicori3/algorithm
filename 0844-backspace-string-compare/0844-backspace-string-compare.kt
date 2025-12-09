class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stackA = ArrayDeque<Char>()
        val stackB = ArrayDeque<Char>()
        fun stacking(stack: ArrayDeque<Char>, c: Char): ArrayDeque<Char> {
            when (c) {
                '#' -> stack.removeFirstOrNull()
                else -> stack.addFirst(c)
            }

            return stack
        }

        s.forEach {
            stacking(stackA, it)
        }
        t.forEach {
            stacking(stackB, it)
        }

        return stackA == stackB
    }
}