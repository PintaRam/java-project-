import java.util.Scanner;
import java.util.Stack;

public class StackArrayImplementation {
    int top;
    int capacity;
    int[] stack;

    StackArrayImplementation() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");

        }
        stack[++top] = data;
        return;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        top--;
    }

    public void peek() {
        System.out.println("The peek elements of stack  is :");
        System.out.println(stack[top]);

    }

    public void display() {
        System.out.println("stack contents : ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "  ");
        }
    }

    public static void main(String args[]) {
        StackArrayImplementation st = new StackArrayImplementation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be pushed into the stack : ");
        int n = sc.nextInt();
        if (n <= 0 || n > st.capacity) {
            System.out.println("please enter the corrct size of stack : ");
            n = sc.nextInt();
        }

        System.out.print("Enter the stack elements : ");
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            st.push(d);
        }
        System.out.println();
        st.display();
        System.out.println();
        st.peek();
        System.out.println("Enter the number of elements to be popped : ");
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            st.pop();
        }
        System.out.println();
        System.out.println("After pop out the stack contents : ");
        st.display();
        System.out.println();

    }
}