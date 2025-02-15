import java.util.*;

public class Stack_pop {
    int MAX = 1000;
    int top;
    int stack[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack_pop() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            stack[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int x = stack[top--];
            return x;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String args[]) {
        Stack_pop s = new Stack_pop();

        System.out.println("Enter the number of element in stack: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the elements of stack: ");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            s.push(ele);
        }
        System.out.println("Elements present in stack: ");
        s.printStack();
        System.out.println("Element " + s.pop() + " Popped from stack");

        s.printStack();

    }
}
