import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class deleteAtEnd {
    static Node head;

    static Node delete(Node head) {

        // checking if the list is empty
        if (head == null) {
            return null;
        }
        // checking if the list contains only one node
        if (head.next == null) {
            head = null;
        }

        // traverse to the last second node of the list
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }

        second_last.next = null;

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

        head = delete(head);
        System.out.println("Linked list after deleting node: ");

        print(head);
    }
}
