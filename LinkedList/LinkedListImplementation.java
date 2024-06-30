package LinkedList;

class LinkedList {

    Node head;

    LinkedList(int data) {
        this.head = new Node(data);
    }

    // function to add the node in linked list
    void addNode(int data, LinkedList h) {
        Node newNode = new Node(data);
        Node temp = h.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    // function to print the linked list
    void printLL(LinkedList l) {
        Node temp = l.head;
        while (temp != null) {
            System.out.print(" " + temp.data + " ->");
            temp = temp.next;
        }
    }

    // to change the head of the linkedlist
    void addNodeToHead(int data, LinkedList h) {
        Node newNode = new Node(data);
        Node temp = h.head;
        // 0
        // 1->2->3->
        newNode.next = temp;
        h.head = newNode;
    }

    // functioon to delete the node based on position
    void deleteNode(int position, LinkedList h) {
        Node temp = h.head;
        int count = 1;

        if (position == 1) {
            h.head = temp.next;
            return;
        }

        while (temp.next != null) {
            Node previousNode = temp;
            temp = temp.next;
            count = count + 1;
            if (count == position) {
                previousNode.next = temp.next;
                break;
            }
        }
    }

    // to find the length of the linked list
    int lengthOfLinkedList(LinkedList l) {
        int length = 1;
        Node temp = l.head;

        while (temp.next != null) {
            length = length + 1;
            temp = temp.next;
        }
        return length;
    }

    // to search for the element in the linked list
    int searchInLinkedList(LinkedList l, int data) {
        Node temp = l.head;
        int count = 1;
        while (temp != null) {

            if (temp.data == data) {
                return count;
            }
            temp = temp.next;
            count = count + 1;
        }
        return -1;
    }

    // leetcode solution to find the middle of the linked list
    static Node findMiddleOfLinkedList(LinkedList ll) {

        int length = ll.lengthOfLinkedList(ll);
        int count = 1;
        Node temp = ll.head;
        Node newHead = null;
        while (temp != null) {
            temp = temp.next;
            count = count + 1;
            if (count == (length / 2) + 1) {
                newHead = temp;
            }
        }
        return newHead;
    }

    // leetcode solution to return the reversed linked list
    static LinkedList reverseLinkedList(LinkedList LL) {
        Node prev = null;
        Node current = LL.head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        LL.head = prev;
        return LL;

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedListImplementation {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(1);
        l1.addNode(2, l1);
        l1.addNode(3, l1);
        l1.addNode(4, l1);
        l1.addNode(5, l1);
        l1.addNode(6, l1);

        // l1.printLL(l1);

        // LinkedList revLinkedList = l1.reverseLinkedList(l1);

        // System.out.println();
        // revLinkedList.printLL(l1);

        Node newHead = l1.findMiddleOfLinkedList(l1);
        LinkedList newLL = new LinkedList(0);
        newLL.head = newHead;

        newLL.printLL(newLL);

    }

}
