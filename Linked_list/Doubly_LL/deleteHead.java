import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int new_data) {
        data = new_data;
        prev = next = null;
    }
}

public class deleteHead {
    static Node head;

    public static Node delete(Node head) {
        if (head == null) {
            return null;
        }

        Node temp = head;

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;

    }

    public static void append(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.prev = temp;

    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of nodes in linked list: ");
        int n = in.nextInt();

        System.out.println("Enter the data of nodes: ");
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            append(data);
        }

        head = delete(head);

        print(head);

    }
}
