import java.util.*;

public class Stack_push {
    int MAX = 1000;
    int top;
    int stack[] = new int[MAX]; // maximum size of stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack_push() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String args[]) {
        Stack_push s = new Stack_push();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element of stack: ");
        int n = sc.nextInt();

        System.out.println("Enter the element of stack: ");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            s.push(ele);
        }
        s.printStack();
    }
}
