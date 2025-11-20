class Solution {
    fun smallestSubsequence(s: String): String {
        val lastIndex = IntArray(256) { -1 }
        for (i in s.indices) {
            lastIndex[s[i].code] = i
        }

        val stack = ArrayDeque<Int>()
        val inStack = BooleanArray(256)

        for (i in s.indices) {
            val c = s[i]

            if (inStack[c.code]) continue

            while (stack.isNotEmpty()
                && s[stack.last()] > c
                && lastIndex[s[stack.last()].code] > i) {
                val removed = stack.removeLast()
                inStack[s[removed].code] = false
            }

            stack.addLast(i)
            inStack[c.code] = true
        }

        return stack.map { s[it] }.joinToString("")
    }
}