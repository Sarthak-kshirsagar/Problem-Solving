package LinkedList;

class LinkedList {

    Node head;

    LinkedList(int data) {
        this.head = new Node(data);
    }

    void addNode(int data, LinkedList h) {
        Node newNode = new Node(data);
        Node temp = h.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void printLL(LinkedList l) {
        Node temp = l.head;
        while (temp != null) {
            System.out.print(" " + temp.data + " ->");
            temp = temp.next;
        }
    }

    void addNodeToHead(int data, LinkedList h) {
        Node newNode = new Node(data);
        Node temp = h.head;
        // 0
        // 1->2->3->
        newNode.next = temp;
        h.head = newNode;
    }

    void deleteNode(int position, LinkedList h) {
        Node temp = h.head;
        int count = 1;

        // 9->10->11
        // deleting head
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

    int lengthOfLinkedList(LinkedList l) {
        int length = 1;
        Node temp = l.head;

        while (temp.next != null) {
            length = length + 1;
            temp = temp.next;
        }
        return length;
    }

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
        LinkedList l1 = new LinkedList(10);
        l1.addNode(11, l1);
        l1.addNode(12, l1);
        l1.addNode(13, l1);
        l1.addNode(14, l1);
        l1.addNode(15, l1);
        l1.addNodeToHead(9, l1);
        l1.deleteNode(1, l1);
        l1.printLL(l1);
        System.out.println();
        System.out.println("Length of the linked list is " + l1.lengthOfLinkedList(l1));
        System.out.println(" " + l1.searchInLinkedList(l1, 10));
    }

}
