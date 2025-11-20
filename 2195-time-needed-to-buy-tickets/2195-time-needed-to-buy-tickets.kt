class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        return tickets.mapIndexed { index, _ ->
            when {
                k > index -> {
                    min(tickets[index], tickets[k])
                }
                k < index -> {
                    min(tickets[index], tickets[k] - 1)
                }
                else -> {
                    tickets[k]
                }
            }
        }.sum()
    }
}