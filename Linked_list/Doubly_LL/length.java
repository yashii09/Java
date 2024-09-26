import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = prev = null;
    }
}

public class length {

    static Node head;

    public static int length(Node head) {

        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void append(int d) {
        Node new_node = new Node(d);

        // if list is empty
        if (head == null) {
            head = new_node;
            return;
        }

        // traverse the list to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.prev = curr;
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

        int length = length(head);
        System.out.println("The length of linked list: " + length);

    }

}