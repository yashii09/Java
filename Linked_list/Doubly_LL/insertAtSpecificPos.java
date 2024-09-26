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

public class insertAtSpecificPos {

    static Node head;

    public static Node insert(Node head, int data, int pos) {
        Node new_node = new Node(data);

        // Insertion at the beginning
        if (pos == 1) {
            new_node.next = head;

            // if the linked list is not empty
            if (head != null) {
                head.prev = new_node;
            }
            // set the new node as the head of linked list
            head = new_node;

            return head;
        }

        Node curr = head;
        // traverse the list to find the node before the insertion point
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // if the position is out of bounds
        if (curr == null) {
            System.out.println("Position out of bounds.");
            return head;
        }

        // set the prev of new node to curr
        new_node.prev = curr;
        // set the next of new node to the next of curr
        new_node.next = curr.next;
        // update the next of curr
        curr.next = new_node;

        // if the new node is not the last node, update prev of next
        // node to new node
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

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

        try {
            System.out.println("Enter the number of nodes: ");
            int n = in.nextInt();

            System.out.println("Enter the data of nodes: ");

            for (int i = 0; i < n; i++) {
                int data = in.nextInt();
                append(data);
            }

            System.out.println("Enter the element you want to insert: ");
            int data = in.nextInt();
            System.out.println("Enter the specific position at which you want to insert the node: ");
            int pos = in.nextInt();

            head = insert(head, data, pos);

            print(head);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            in.close();
        }
    }

}
