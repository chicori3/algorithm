class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()

        nums1.forEach { num ->
            val index = nums2.indexOfFirst { it == num }
            if (index == -1) {
                result.add(index)
            } else {
                loop@ for (i in index until nums2.size) {
                    if (nums2[i] > num) {
                        result.add(nums2[i])
                        break@loop
                    }
                    if (i + 1 == nums2.size) {
                        result.add(-1)
                    }
                }
            }
        }

        return result.toIntArray()
    }
}