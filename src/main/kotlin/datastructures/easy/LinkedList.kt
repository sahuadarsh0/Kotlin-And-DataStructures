package datastructures.easy
fun main() {
    val list = LinkedList()
    list.addFirst("1")
    list.addFirst("is")
    list.addFirst("this")
    list.printList()
}

class LinkedList {
    var head: ListNode? = null
    class ListNode(var data: Any) {
        var next: ListNode? = null
    }

    fun addFirst(data: Any) {
        val newNode = ListNode(data)
        if (head == null) {
            head = newNode
            return
        }
        newNode.next = head
        head = newNode
    }

    fun addLast() {
    }

    fun printList() {
        var current = head
        while (current != null) {
            print(current.data.toString() + " -> " )
            current = current.next
        }
        print("null")
    }

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        println(head?.data)
        return head
    }

}