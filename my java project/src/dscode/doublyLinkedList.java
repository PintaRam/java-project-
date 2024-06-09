
import java.util.*;

public class doublyLinkedList {
    class Node {
        int data;
        Node prevLink;
        Node nextLink;

        Node(int data) {
            this.data = data;
            this.prevLink = null;
            this.nextLink = null;
        }

    }

    Node head;
    Node tail;

    doublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtFirst(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.nextLink = head;
        head.prevLink = newNode;
        head = newNode;
    }
    public void displayLinkedList() {
        if (head == null) {
            System.out.println("The list is empty ");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ---->");
                temp = temp.nextLink;
            }
            System.out.print("null");
        }
    }
    public void addbeforKey(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
           // head = newNode;
            return;
        }
        if (key == head.data) {
            insertAtFirst(data);
        }
        Node temp = head;
        while (temp.nextLink != null) {
            if (temp.nextLink.data == key) {
                newNode.nextLink = temp.nextLink;
                temp.nextLink.prevLink = newNode;
                temp.nextLink = newNode;
                newNode.prevLink = temp;
                return;
            }

            temp = temp.nextLink;
        }
        System.out.println("key value is not found ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList dl = new doublyLinkedList();
        dl.insertAtFirst(23);
        dl.insertAtFirst(30);
        dl.insertAtFirst(22);
        dl.insertAtFirst(11);
        dl.displayLinkedList();
        dl.addbeforKey(30, 40);
        dl.displayLinkedList();

    }
}
