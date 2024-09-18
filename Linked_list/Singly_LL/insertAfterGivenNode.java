import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class insertAfterGivenNode {
    static Node head;

    public static Node insertion(Node head, int key, int new_data) {
        Node curr = head; // pointer that points to head
        while (curr != null) { // checking whether the key is present or not
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }
        if (curr == null) { // key not found in linked list
            return head;
        }
        // create a new node
        Node new_node = new Node(new_data);
        new_node.next = curr.next;
        curr.next = new_node;

        return head;
    }

    public static void append(int new_data) {
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

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
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

        System.out.println("Enter the given node after which you want to insert new node: ");
        int key = in.nextInt();

        System.out.println("Enter the data of new node to insert: ");
        int data = in.nextInt();

        head = insertion(head, key, data);

        System.out.println("Linked list after inserting new node: ");
        print(head);
    }
}
