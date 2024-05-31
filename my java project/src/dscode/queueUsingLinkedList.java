import java.util.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class queueUsingLinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    Node head, tail;

    queueUsingLinkedList() {
        head = null;
        tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

            return;

        }
        newNode.link = head;
        tail.link = newNode;
        tail = newNode;

    }

    public void display() {
        if (head == null) {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println("queue contents : ");
        Node temp = head;
        do {
            System.out.print(temp.data + "  ");
            temp = temp.link;
        } while (temp != head);
        System.out.println();
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("queue is empty.");
            return;
        }
        int ele = head.data;
        head = head.link;
        tail.link = head;
        System.out.println(ele + " is successfully dequeue from the queue.");
    }

    public void peek() {
        if (head == null) {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println("peek element of a queue is  : " + head.data);
    }

    public int count() {
        if (head == null) {
            System.out.println("queue is empty.");
            return 0;
        }
        Node temp = head;
        int count = 0;
        do {
            temp = temp.link;
            count++;
        } while (temp != head);
        return count;
    }

    public void changeTheDataOFQueue(int pos, int ele) {
        if (pos < 1 || pos > count()) {
            System.out.println("invalid position ");
            return;
        }
        if (head == null) {
            if (pos != 1) {
                System.out.println("invalid position");
                return;
            }
            head.data = ele;
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < pos - 1) {
            i++;
            temp = temp.link;
        }
        temp.data = ele;

    }

    public static void main(String[] args) {
        queueUsingLinkedList que = new queueUsingLinkedList();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("choose the choice among the following choices : ");
            System.out.println(
                    " 1. enqueue an element in queue . \n 2.dequeue an element from queue. \n 3.display the queue . \n 4.peek element of the queue. \n 5.count the number of elements. \n 6.change the data of given postion from the queue.");
            System.out.println("Enter the choice of from the above elements : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the element to be pushed into the queue : ");
                    int ele = sc.nextInt();
                    que.enqueue(ele);
                    break;
                case 2:
                    que.dequeue();
                    break;
                case 3:
                    que.display();
                    break;
                case 4:
                    que.peek();
                    break;
                case 5:
                    int count = que.count();
                    System.out.println("number of elements  in queue is : " + count);
                    break;
                case 6:
                    System.out.println(
                            "Enter the position of elements where the elements to be added and also enter the elements to be added : ");
                    int pos = sc.nextInt();
                    int data = sc.nextInt();
                    que.changeTheDataOFQueue(pos, data);
                    break;

                default:
                    System.out.println("invalid choice please check choices given above .");
                    break;
            }
        }

    }
}
