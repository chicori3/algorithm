class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val first = nums.copyOfRange(0, n)
        val second = nums.copyOfRange(n, nums.size)
        val result = mutableListOf<Int>()

        repeat((0..<n).count()) {
            result.add(first[it])
            result.add(second[it])
        }

        return result.toIntArray()
    }
}