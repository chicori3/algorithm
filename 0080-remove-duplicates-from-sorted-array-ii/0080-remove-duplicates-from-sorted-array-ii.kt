class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 2

        for (i in 2 until nums.size) {
            if (nums[i] != nums[index - 1] ||
                (nums[i] == nums[index - 1] && nums[i] != nums[index - 2])
            ) {
                nums[index] = nums[i]
                index++
            }
        }

        return index
    }
}