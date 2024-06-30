package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head;

    DoublyLinkedList(int data) {
        this.head = new Node(data);
    }

    // adding a node in doubly linked list
    void addNode(Node head, int data) {
        Node temp = head;
        Node previousNode = head;

        // Node prev = new Node(0);
        while (temp.next != null) {
            previousNode = temp;
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.prev = previousNode;

    }

    // traversal of doubly linkedList

    static void doubleyLinkedListTraversal(DoublyLinkedList l) {
        Node temp = l.head;
        while (temp != null) {
            System.out.print("" + temp.data + "-> ");
            temp = temp.next;
        }
    }

    // finding a node in doubly linked list and returning its previous node

    static void findPositionAndReturnPrevious(DoublyLinkedList l, int position) {
        Node temp = l.head;
        int count = 1;
        while (temp != null) {
            if (temp.data == position) {
                System.out.println("found the node in linked list");
                System.out.println("Position:- " + count + " previous is " + temp.prev.data);
            }
            temp = temp.next;
            count = count + 1;
        }
    }

    static void deleteNodeFromDoublyLinkedList(DoublyLinkedList l, int position) {
        Node temp = l.head;
        int count = 1;
        // 1->2->3->4-5->
        while (temp != null) {
            if (count == position) {
                
            }
        }
    }

    public static void main(String[] args) {

        // 1->2->3->4;

        DoublyLinkedList d1 = new DoublyLinkedList(0);

        d1.addNode(d1.head, 1);
        d1.addNode(d1.head, 2);
        d1.addNode(d1.head, 3);
        d1.addNode(d1.head, 4);
        doubleyLinkedListTraversal(d1);
        findPositionAndReturnPrevious(d1, 1);

    }

}
