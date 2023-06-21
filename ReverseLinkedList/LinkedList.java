package ReverseLinkedList;

public class LinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    Node createNode() {

        Node head = null;
        Node tail = null;

        for (int i = 1; i < 5; i++) {

            Node node = new Node(i);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        return head;

    }

    Node Reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;
    }

    void printLinkedList(Node head) {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.getNext();
    }
    System.out.println();
}

}
