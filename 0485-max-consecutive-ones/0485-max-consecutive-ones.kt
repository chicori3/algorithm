class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var currentCount = 0
        var maxCount = 0

        for (num in nums) {
            if (num == 1) {
                currentCount++
                maxCount = maxOf(currentCount, maxCount)
            } else {
                currentCount = 0
            }
        }

        return maxCount
    }
}