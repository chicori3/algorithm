class MyQueue() {
    private var currentNode: Node? = null

    fun push(x: Int) {
        val node = Node(x)
        if (currentNode == null) {
            this.currentNode = node
        } else {
            this.currentNode!!.addNode(node)
        }
    }

    fun pop(): Int {
        if (currentNode != null) {
            val value = currentNode!!.value
            currentNode = this.currentNode!!.nextNode
            return value
        }
        throw Exception()
    }

    fun peek(): Int {
        if (currentNode != null) {
            return currentNode!!.value
        }
        throw Exception()
    }

    fun empty(): Boolean {
        return currentNode == null
    }

    class Node(
        val value: Int,
        var nextNode: Node? = null,
    ) {
        fun addNode(node: Node) {
            if (this.nextNode == null) {
                this.nextNode = node
            } else {
                this.nextNode!!.addNode(node)
            }
        }
    }
}
