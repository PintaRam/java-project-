import java.util.*;

public class stackUsingLInkedList {
    class Node {
        int data;
        Node link;

        Node(int ele) {
            data = ele;
            link = null;
        }
    }

    Node head, tail;

    stackUsingLInkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int ele) {
        Node newNode = new Node(ele);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty .");
            return;
        }
        int data = head.data;
        head = head.link;
        System.out.println(data + " is successfully pop from the stack.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "    ");
            temp = temp.link;
        }
        System.out.println();
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("stack is empty.");
            return;
        }
        System.out.println("peek element of a stack is : " + head.data);
    }

    public int count() {
        if (isEmpty()) {
            System.out.println("stack is empty.");
            return 0;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.link;
        }

        return count;
    }

    public void changeTheDataOFStack(int pos, int ele) {
        if (pos < 1 || pos > count()) {
            System.out.println("invalid position.");
            return;
        }
        if (isEmpty()) {
            if (pos != 1) {
                System.out.println("invlid postion.");
                return;
            }
            head.data = ele;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < pos - 1) {
            i++;
            temp = temp.link;
        }
        temp.data = ele;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackUsingLInkedList st = new stackUsingLInkedList();
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
                    System.out.println(ele + " is successfully push into the stack.");
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
                    int count = st.count();
                    System.out.println("number of elements in stack is  : " + count);
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
