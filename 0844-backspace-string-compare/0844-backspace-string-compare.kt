class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val stackA = ArrayDeque<Char>()
        val stackB = ArrayDeque<Char>()

        s.forEach { c ->
            when (c) {
                '#' -> if (stackA.isNotEmpty()) stackA.removeFirst()
                else -> stackA.addFirst(c)
            }
        }
        t.forEach { c ->
            when (c) {
                '#' -> if (stackB.isNotEmpty()) stackB.removeFirst()
                else -> stackB.addFirst(c)
            }
        }

        return stackA == stackB
    }
}