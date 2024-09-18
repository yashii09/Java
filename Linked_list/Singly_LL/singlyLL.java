import java.util.*;

class Node {
    int data; // data field
    Node next; // next node

    // constructor to initialize a new node with data
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class singlyLL {

    static Node head;

    /*
     * traverse the list using iteration
     * public static void traverseList(Node head) {
     * // A run that runs till head is nullptr
     * while (head != null) {
     * System.out.print(head.data + " ");
     * head = head.next;
     * }
     * System.out.println();
     * 
     * }
     */

    public static void traverseList(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        traverseList(head.next);
    }

    static void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public static void main(String[] args) {

        // input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of node");
        int n = in.nextInt();

        System.out.println("Enter the data for the nodes: ");
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            append(data);
        }

        System.out.println("Linked List: ");
        traverseList(head);

        /*
         * hard coded linked list
         * Node head = new Node(10);
         * head.next = new Node(20);
         * head.next.next = new Node(30);
         * head.next.next.next = new Node(40);
         * 
         * System.out.println("Linked List: ");
         * traverseList(head);
         */
    }
}