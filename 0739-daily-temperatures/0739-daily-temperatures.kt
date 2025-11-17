class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = temperatures.clone()
        val stack = ArrayDeque<Int>()

        for (i in result.indices) {
            while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
                val index = stack.removeLast()
                result[index] = i - index
            }

            stack.addLast(i)
        }

        for (i in stack) {
            result[i] = 0
        }

        return result
    }
}