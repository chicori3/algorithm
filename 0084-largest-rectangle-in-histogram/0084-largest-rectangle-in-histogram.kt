class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = ArrayDeque<Int>()
        var maxArea = 0

        for (i in heights.indices) {
            while (stack.isNotEmpty() && heights[stack.last()] > heights[i]) {
                val height = heights[stack.removeLast()]
                val left = if (stack.isEmpty()) -1 else stack.last()
                val width = i - left - 1

                maxArea = maxOf(maxArea, height * width)
            }

            stack.addLast(i)
        }
        
        while (stack.isNotEmpty()) {
            val height = heights[stack.removeLast()]
            val left = if (stack.isEmpty()) -1 else stack.last()
            val width = heights.size - left - 1
        
            maxArea = maxOf(maxArea, height * width)
        }

        return maxArea
    }
}