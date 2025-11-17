class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val set = nums.toSet()
        val list = mutableListOf<Int>()

        for (i in 1..nums.size) {
            if (set.contains(i)) {
                continue
            }
            list.add(i)
        }

        return list
    }
}