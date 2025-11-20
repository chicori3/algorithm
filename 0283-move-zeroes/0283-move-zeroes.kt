class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var index = 0
        var zeroCount = 0

        for (i in nums.indices) {
            if (nums[i] == 0) {
                zeroCount++
            }
            if (nums[i] != 0) {
                nums[index] = nums[i]
                index++
            }
        }

        for (i in nums.indices.reversed()) {
            if (zeroCount > 0) {
                nums[i] = 0
                zeroCount--
            }
        }
    }
}