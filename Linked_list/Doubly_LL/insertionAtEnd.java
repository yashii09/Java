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

public class insertionAtEnd {

    static Node head;

    public static Node insert(Node head, int data) {
        Node new_node = new Node(data);

        Node curr = head;
        // if the LL is empty return head
        if (head == null) {
            return head;
        }
        // traverse to find the last node
        while (curr.next != null) {
            curr = curr.next;
        }
        // set the prev of new_node to curr
        new_node.prev = curr;
        // set the next of last node to new node
        curr.next = new_node;

        return head;
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

        System.out.println("Enter the element you want to insert ");
        int data = in.nextInt();

        head = insert(head, data);

        print(head);

    }

}
