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

public class insertionAfterGivenNode {

    static Node head;

    public static Node insert(Node head, int data, int key) {
        Node new_node = new Node(data);

        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        // set prev of new node to the given node
        new_node.prev = curr;
        // set next of new node to the next of given node
        new_node.next = curr.next;
        // update the next of the given node to the new node
        curr.next = new_node;

        // update the prev of new node's next with the new node
        if (new_node.next != null) {
            curr.next.prev = new_node;
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
        System.out.println("Enter the number of nodes: ");
        int n = in.nextInt();

        System.out.println("Enter the data of nodes: ");

        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            append(data);
        }

        System.out.println("Enter the element you want to insert ");
        int data = in.nextInt();
        System.out.println("Enter the specific node after which you want to insert the node: ");
        int key = in.nextInt();
        head = insert(head, data, key);

        print(head);

    }

}