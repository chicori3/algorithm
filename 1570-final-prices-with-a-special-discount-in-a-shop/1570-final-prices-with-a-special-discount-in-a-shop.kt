class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val result = prices.clone()
        val stack = ArrayDeque<Int>()

        for (i in prices.indices) {
            while (stack.isNotEmpty() && prices[stack.last()] >= prices[i]) {
                val index = stack.removeLast()
                result[index] = prices[index] - prices[i]
            }

            stack.addLast(i)
        }

        return result
    }
}