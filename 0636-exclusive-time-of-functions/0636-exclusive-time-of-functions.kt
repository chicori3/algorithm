class Solution {
    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
        val result = IntArray(n)
        val stack = ArrayDeque<Int>()
        var prevTime = 0

        for (log in logs) {
            val parts = log.split(":")
            val id = parts[0].toInt()
            val type = parts[1]
            val time = parts[2].toInt()

            when (type) {
                "start" -> {
                    if (stack.isNotEmpty()) {
                        result[stack.last()] += time - prevTime
                    }
                    stack.addLast(id)
                    prevTime = time
                }

                "end" -> {
                    result[stack.removeLast()] += time - prevTime + 1
                    prevTime = time + 1
                }
            }
        }

        return result
    }
}