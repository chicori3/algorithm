class MinStack() {
    var currentNode: Node? = null

    fun push(`val`: Int) {
        val min: Int = currentNode?.min?.let { minOf(`val`, it) } ?: `val`
        currentNode = Node(`val`, min, currentNode)
    }

    fun pop() {
        currentNode = currentNode?.prev
    }

    fun top(): Int {
        return currentNode?.value!!
    }

    fun getMin(): Int {
        return currentNode?.min!!
    }

    data class Node(
        val value: Int,
        val min: Int,
        val prev: Node?,
    )
}