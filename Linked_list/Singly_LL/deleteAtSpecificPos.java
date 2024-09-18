import java.util.*;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class deleteAtSpecificPos {
    static Node head;

    static Node delete(Node head, int pos) {

        // to check if the pos is invalid
        if (head == null && pos < 1) {
            return null;
        }
        // if the pos of the node to be deleted is head
        if (pos == 1) {
            Node del = head;
            head = head.next;
            del = null;
            return head;
        }

        // traverse to the node just before the position of the node to be deleted.
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        // checking if pos is out of bound
        if (temp == null || temp.next == null) {
            return null;
        }
        // storing the node to be deleted
        Node del = temp.next;
        temp.next = temp.next.next;

        del = null;

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

        System.out.println("Enter the position of the node which you want to delete: ");
        int pos = in.nextInt();

        head = delete(head, pos);
        System.out.println("Linked list after deleting node: ");

        print(head);
    }
}