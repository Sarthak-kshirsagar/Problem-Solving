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

    // function for adding two linkedLists
    static LinkedList addingTwoLinkedList(LinkedList l1, LinkedList l2) {
        // for adding the head of the linked list
        int carry = 0;
        int ans = l1.head.data + l2.head.data;
        carry = ans / 10;
        ans = ans % 10;

        LinkedList result = new LinkedList(ans);
        Node temp1 = l1.head.next;
        Node temp2 = l2.head.next;
        // if the length of both the linked list is equal to 1,and addition of head
        // contains carry
        if (l1.head.next == null && l2.head.next == null && carry > 0) {
            result.addNode(carry, result);
        }

        // to iteratively add the add the linkedlist
        while (temp1 != null) {
            System.out.println("entered");

            if (temp1 != null && temp2 != null) {
                int answer = temp1.data + temp2.data + carry;
                carry = 0;
                carry = answer / 10;
                int unitPlace = answer % 10;

                result.addNode(unitPlace, result);

            }
            temp1 = temp1.next;
            temp2 = temp2.next;

            // if the lenght of linked list is not equal , if any of the temp reaches null ,
            // break from the loop
            if (temp1 == null || temp2 == null) {
                System.out.println("loop breaked");
                break;
            }

        }

        // adding the remaining nodes to the linked list
        while (temp1 != null) {
            Node answerNode = new Node(temp1.data);
            result.addNode(answerNode.data + carry, result);
            carry = 0;
            temp1 = temp1.next;
        }
        // adding the remaining nodes to the linked list
        while (temp2 != null) {
            Node answerNode = new Node(temp2.data);
            result.addNode(answerNode.data + carry, result);
            carry = 0;
            temp2 = temp2.next;
        }

        return result;
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
        // linked list one
        LinkedList l1 = new LinkedList(1);
        l1.addNode(0, l1);
        l1.addNode(0, l1);

        // linked list two
        LinkedList l2 = new LinkedList(1);
        l2.addNode(0, l2);
        l2.addNode(0, l2);

        // addition of the linked lists
        LinkedList result = new LinkedList(0);
        result = result.addingTwoLinkedList(l1, l2);
        result.printLL(result);

    }

}
