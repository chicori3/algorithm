class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val count = IntArray(2)

        for (student in students) {
            count[student]++
        }

        for (sandwich in sandwiches) {
            if (count[sandwich] > 0) {
                count[sandwich]--
            } else {
                break
            }
        }

        return count.sum()
    }
}