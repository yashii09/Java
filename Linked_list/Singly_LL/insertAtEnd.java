import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class insertAtEnd {
    static Node head;

    static Node insertion(Node head, int new_data) {

        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return head;
        }
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.next = null;

        return head;
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
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
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

        System.out.println("Enter the data of node you want to insert: ");
        int data = in.nextInt();

        head = insertion(head, data);

        System.out.println("Linked list after insertion is: ");
        print(head);
    }
}
