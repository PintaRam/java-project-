import java.util.*;

class Stack1 {
    char[] stack;
    int capacity;
    int top;

    Stack1(int size) {
        top = -1;
        capacity = size;
        stack = new char[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public void push(char ele) {
        if (isFull()) {
            System.out.println("stack  is full ");
            return;
        }
        stack[++top] = ele;

    }

    public char pop() {
        char ch = stack[top];
        if (isEmpty()) {
            System.out.println("stack is empty");

        } else {

            top--;
        }
        return ch;

    }
}

class queueUsingLinkedList {
    class Node {
        String str;
        Node link;

        Node(String str) {
            this.str = str;
            this.link = null;
        }
    }

    Node head, tail;

    queueUsingLinkedList() {
        head = null;
        tail = null;
    }

    public void enqueue(String str) {
        Node newNode = new Node(str);
        if (head == null) {
            head = newNode;
            tail = newNode;

            return;

        }
        tail.link = newNode;
        tail = newNode;

    }

    public String dequeue() {
        if (head == null) {
            System.out.println("queue is empty.");
        }
        String str2 = head.str;
        head = head.link;
        if (head == null) {
            tail = null;
        }
        return str2;
    }
}

public class palindromeUsingStack {
    public void inputTheStringIntoQueue(Scanner sc, queueUsingLinkedList que) {
        System.out.println("Enter the number of words to be entered : ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("please enter a valid input : ");
            size = sc.nextInt();
        }

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter the words to be added into the queue: ");
            String str = sc.nextLine();
            str = sc.next();
            que.enqueue(str);
        }
        while (que.head != null) {
            inputThecharIntoStack(que);
        }
    }

    public void inputThecharIntoStack(queueUsingLinkedList que) {
        String str1 = que.dequeue();
        Stack1 st = new Stack1(str1.length());

        for (int i = 0; i < str1.length(); i++) {
            st.push(str1.charAt(i));
        }

        reveStringFromStack(st, str1);

    }

    public void reveStringFromStack(Stack1 st, String orig) {
        String str = "";
        for (int i = st.top; i >= 0; i--) {
            str = str + String.valueOf(st.pop());
        }
        checkForPalindrome(orig, str);
    }

    public void checkForPalindrome(String orgi, String rever) {
        if (orgi.equals(rever)) {
            System.out.println(orgi + " is a palindrome ");
        } else {
            System.out.println(orgi + " is not a palindrome. ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueUsingLinkedList que = new queueUsingLinkedList();
        palindromeUsingStack pd = new palindromeUsingStack();
        pd.inputTheStringIntoQueue(sc, que);

    }

}
