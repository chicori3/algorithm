class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        val result = mutableListOf<String>()
        var targetIndex = 0

        for (i in 1..n) {
            if (targetIndex >= target.size) break

            result.add("Push")

            if (target[targetIndex] != i) {
                result.add("Pop")
            } else {
                targetIndex++
            }
        }

        return result
    }
}