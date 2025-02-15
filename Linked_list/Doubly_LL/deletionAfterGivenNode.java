import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int new_data){
        data = new_data;
        next = prev = null;
    }
} 

public class deletionAfterGivenNode {
    static Node head;

    public static Node delete(Node head, int key){

        Node  curr = head; 

        //iterate over LL to find key
        while(curr != null){
            if(curr.data == key){
                break;
            }
            curr = curr.next;
        }

        //if curr and curr.next is null , no node to delete
        if(curr == null || curr.next == null){
            return head;
        }

        //Node to be deleted
        Node nodeDelete = curr.next;

        curr.next = nodeDelete.next;
        
        //if the node to be deleted is not last node
        if(curr.next != null){
            nodeDelete.next.prev = curr;
        }

        return head;
        
    }

    public static void append(int new_data){
        Node new_node = new Node(new_data);

        if(head == null){
            head = new_node;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.prev = temp;
    }

    public static void print(Node head){
        Node curr = head;

        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = in.nextInt();

        System.out.println("Enter the data of nodes: ");
        for(int i = 0; i < n; i++){
            int data = in.nextInt();
            append(data);
        }
        
        System.out.println("Enter the specific node after which you want to delete the node: ");
        int key = in.nextInt();

        delete(head, key);

        System.out.println("Linked List after deleting the node: ");
        print(head);

    }
}
