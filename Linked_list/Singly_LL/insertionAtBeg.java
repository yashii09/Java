import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class insertionAtBeg {

    static Node head;

    public static Node insertNode(Node head, int new_data) {
        Node new_node = new Node(new_data); // creating a new node

        // make the next of the new node point to current head
        new_node.next = head;

        // return new node as head
        return new_node;

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

    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = in.nextInt();

        System.out.println("Enter the data of nodes: ");
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            append(data);
        }

        System.out.println("Linked list after inserting node at the beginning: ");
        int data = 1;
        head = insertNode(head, data);

        print(head);
    }
}
