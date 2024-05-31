package dscode;
import java.util.*;

public class queueUsingArrays {

    int front, rear, capacity;
    int[] queue;

    queueUsingArrays(int size) {
        front = rear = -1;
        queue = new int[size];
        capacity = size;

    }

    public boolean isEmpty() {
        return (front > rear || front == -1);
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int ele) {
        if (isFull()) {
            System.out.println("queue is full.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = ele;

    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return;
        }
        int data = queue[front];
        ++front;
        System.out.println(data + " is successfully dequeue from the queue.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return;
        }
        System.out.println(front);
        System.out.println("queue contents : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "   ");
        }
        System.out.println();
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("queue is empty .");
            return;
        }
        System.out.println("peek elements is  : " + queue[front]);
    }

    public void count() {
        if (isEmpty()) {
            System.out.println("queue is empty.");
            return;
        }
        int count = 0;
        for (int i = front; i <= rear; i++) {
            count++;
        }
        System.out.println("number of elemenst in queue is : " + count);
    }

    public void changeTheDataOFQueue(int pos, int ele) {
        if (pos < 0 || pos > capacity) {
            System.out.println("invalid position. ");
            return;
        }
        queue[pos] = ele;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue  : ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("please enter the right value of a size of a queue : ");
            size = sc.nextInt();
        }
        queueUsingArrays que = new queueUsingArrays(size);
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
                    que.count();
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
