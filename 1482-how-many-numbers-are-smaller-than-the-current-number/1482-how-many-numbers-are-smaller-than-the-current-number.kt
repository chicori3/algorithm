class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()

        for (current in nums) {
            list.add(nums.count { current > it })
        }

        return list.toIntArray()
    }
}