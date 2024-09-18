class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class length {

    // public static int length(Node head) {

    // int count = 0;
    // Node curr = head;

    // while (curr != null) {
    // count++;
    // curr = curr.next;
    // }
    // return count;
    // }

    public static int length(Node head) {

        if (head == null) {
            return 0;
        }
        return 1 + length(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int count = length(head);

        System.out.println("The length of linked list is : " + count);
    }

}
