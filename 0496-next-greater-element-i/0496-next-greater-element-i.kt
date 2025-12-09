class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()
        val stack = ArrayDeque<Int>()

        nums2.forEach {
            while (stack.isNotEmpty() && stack.first() < it) {
                map[stack.removeFirst()] = it
            }
            
            stack.addFirst(it)
        }

        nums1.forEach {
            result.add(map[it] ?: -1)
        }

        return result.toIntArray()
    }
}