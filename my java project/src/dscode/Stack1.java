import java.util.*;

class Stack1 {
    int[] stack;
    int capacity;
    int top;

    Stack1(int size) {
        top = -1;
        capacity = size;
        stack = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public void push(int ele) {
        if (isFull()) {
            System.out.println("stack  is full ");
            return;
        }
        stack[++top] = ele;
        System.out.println(ele + "is successfully added into the stack.");

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty .");
            return;
        }
        System.out.println("stack contents : ");
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + "   ");
        System.out.println();

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        top--;
        System.out.println(stack[top + 1] + "is successfully removed from a stack.");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty ");
            return;
        }
        System.out.println("peek elements is  : " + stack[top]);
    }

    public void count() {
        if (isEmpty()) {
            System.out.println("stack is empty : ");
            return;
        }
        System.out.println("number of elements in stack is : " + (top + 1));
    }

    public void changeTheDataOFStack(int pos, int data) {
        if (pos < 0 || pos > capacity) {
            System.out.println("invalid position : ");
            return;
        }
        stack[pos] = data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  stack : ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("please enter the right value of a size of a stack : ");
            size = sc.nextInt();
        }
        Stack1 st = new Stack1(size);
        boolean flag = true;
        while (flag) {
            System.out.println("choose the choice among the following choices : ");
            System.out.println(
                    " 1. push an element in stack . \n 2.pop an element from stack. \n 3.display the stack . \n 4.peek element of the stack. \n 5.count the number of elements. \n 6.change the data of given postion from the stack.");
            System.out.println("Enter the choice of from the above elements : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the element to be pushed into the stack : ");
                    int ele = sc.nextInt();
                    st.push(ele);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    st.peek();
                    break;
                case 5:
                    st.count();
                    break;
                case 6:
                    System.out.println(
                            "Enter the position of elements where the elements to be added and also enter the elements to be added : ");
                    int pos = sc.nextInt();
                    int data = sc.nextInt();
                    st.changeTheDataOFStack(pos, data);
                    break;

                default:
                    System.out.println("invalid choice please check choices given above .");
                    break;
            }
        }

    }
}
