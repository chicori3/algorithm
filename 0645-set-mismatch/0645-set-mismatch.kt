class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val n = nums.size
        
        val expectedSum = n * (n + 1) / 2
        val actualSum = nums.sum()
        val setSum = nums.toSet().sum()

        val duplicate = actualSum - setSum
        val missing = expectedSum - setSum

        return intArrayOf(duplicate, missing)
    }
}