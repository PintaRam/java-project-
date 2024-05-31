package dscode;
import java.util.Scanner;


public class linkedlist {
    class Node {
        int data;
        Node link;

        Node(int d) {
            data = d;
            link = null;
        }
    }

    Node head, tail;

    linkedlist() {
        head = null;
        tail = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.link = head;
            head = newNode;
        }
    }

    public void insertAtlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.link != tail) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void displayLinkedList() {
        if (head == null) {
            System.out.println("The list is empty ");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ---->");
                temp = temp.link;
            }
            System.out.print("null");
        }
    }

    public void addAfterKey(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp != tail) {

            if (temp.data == key) {

                newNode.link = temp.link;
                temp.link = newNode;
                return;

            }
            temp = temp.link;

        }

        System.out.println("key value not found: ");
    }

    public void addbeforKey(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (key == head.data) {
            newNode.link = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int flag = 1;
        while (temp.link != null) {
            if (temp.link.data == key) {
                newNode.link = temp.link;
                temp.link = newNode;
                return;
            }

            temp = temp.link;
        }
        System.out.println("key value is not found ");

    }

    public void search(int ele) {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == ele) {
                System.out.println("searched element is found ");
                return;
            }
            temp = temp.link;
        }
        System.out.println("element is not found ");
    }

    public void addAtpos(int pos, int data) {
        if (pos < 1) {
            System.out.println("invalid positon ");
            return;
        }
        if (pos > sizeOfLinkedList() + 1) {
            System.out.println("position is out of range");
            return;
        }
        Node newNode = new Node(data);
        if (head == null) {
            if (pos != 1) {
                System.out.println("invalid postion because list is empty ");
                return;
            }
            head = newNode;
            return;

        }
        Node temp = head;
        int i = 1;
        while (i < pos - 1) {
            temp = temp.link;
            i++;
        }
        if (temp != null) {
            newNode.link = temp.link;
            temp.link = newNode;
            return;
        }
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("list is empty : ");
            return;
        }
        head = head.link;

    }

    public void removelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.link != null) {
            if (temp.link.link == null) {
                temp.link = null;
                return;
            }
            temp = temp.link;

        }
        return;

    }

    public void removeKeyValue(int key) {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        if (head.data == key) {
            head = head.link;
            return;
        }
        Node temp = head;
        while (temp.link != null) {
            if (temp.link.data == key) {
                temp.link = temp.link.link;
                return;
            }
            temp = temp.link;
        }

    }

    public void removeAfterKey(int key) {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                temp.link = temp.link.link;
                return;
            }
            temp = temp.link;
        }
        return;
    }

    public void removeBeforeKey(int key) {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        if (head.data == key) {
            head = head.link;
            return;
        }
        Node temp = head;
        while (temp.link != null) {
            if (temp.link.link.data == key) {
                temp.link = temp.link.link;
                return;
            }
            temp = temp.link;
        }
        return;
    }

    public void removeAtPos(int pos) {
        if (pos < 1) {
            System.out.println("invalid position ");
            return;
        }
        if (head == null) {
            System.out.println("list is empty ");
            return;

        }
        int i = 1;
        Node temp = head;
        while (i < pos - 1) {
            temp = temp.link;
        }
        if (temp != null) {
            temp.link = temp.link.link;
            return;
        }
    }

    public int sizeOfLinkedList() {
        if (head == null) {
            return 1;
        }
        Node temp = head;
        int i = 1;
        while (temp.link != null) {
            i++;
            temp = temp.link;
        }
        return i;
    }

public static void main(String[] args) {
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the starting values values : ");
            int data = sc.nextInt();
            list.insertAtBegin(data);
            list.displayLinkedList();
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter the last values values : ");
            int data = sc.nextInt();
            list.insertAtlast(data);
            list.displayLinkedList();
            System.out.println();
        }
        System.out.println("Enter the data and key values of add after key: ");
        int data = sc.nextInt();
        int key = sc.nextInt();
        list.addAfterKey(key, data);
        list.displayLinkedList();
        System.out.println();
        System.out.println("Enter the data and key values of add before key : ");
        int d = sc.nextInt();
        int key2 = sc.nextInt();
        list.addbeforKey(key2, d);
        list.displayLinkedList();
        System.out.println();
        System.out.println("Enter the search element : ");
        int ele = sc.nextInt();
        list.search(ele);
        System.out.println("Enter the position and data : ");
        int pos = sc.nextInt();
        int d2 = sc.nextInt();
        list.addAtpos(pos, d2);
        list.displayLinkedList();
        System.out.println();

        System.out.println("enter the key element of removing after key : ");
        int key4 = sc.nextInt();
        list.removeAfterKey(key4);
        list.displayLinkedList();
        System.out.println();
        System.out.println("enter the key element of removing before key");
        int key5 = sc.nextInt();
        list.removeBeforeKey(key5);
        list.displayLinkedList();
        System.out.println();
        System.out.println("enter the position of removal element");
        int pos2 = sc.nextInt();
        list.removeAtPos(pos2);
        System.out.println();
        list.displayLinkedList();

    }

}
