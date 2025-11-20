class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var seconds = 0
        val clone = tickets.clone()

        while (clone[k] > 0) {
            for (i in clone.indices) {
                if (clone[i] > 0) {
                    clone[i]--
                    seconds++
                }

                if (clone[k] == 0) {
                    return seconds
                }
            }
        }

        return 0
    }
}