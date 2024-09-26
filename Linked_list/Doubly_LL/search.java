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

public class search {

    static Node head;

    public static int search(Node head, int key) {
        Node curr = head;
        int pos = 0;

        while (curr != null && curr.data != key) {
            pos++;
            curr = curr.next;
        }

        if (curr == null || curr.data != key) {
            return -1;
        }

        return (pos + 1);

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

        System.out.println("Enter the element you want to search: ");
        int key = in.nextInt();
        int pos = search(head, key);

        System.out.println("The key is present at position: " + pos);

    }

}
