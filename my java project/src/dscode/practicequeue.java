import java.util.*;
public class practicequeue{
    int queue[];
    int capacity;
    int front , rear;
    practicequeue(int size)
    {
        queue = new int[size];
        capacity = size;
        front = -1;rear =-1;

    }
    public boolean isempty()
    {
        return front ==-1;
    }
    public boolean isFull()
    {
        return rear == capacity;
    }
    public void enqueue(int ele)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(front ==-1)
        {
            front =0;
        }
        queue[++rear] = ele;

    }
    public  void dequeue(){
        if(isempty())
        {
            System.out.println("queue id empty");
            return;
        }
        front++;
    }
    public void displayqueue()
    {
        if(isempty())
        {
            System.out.println("queue is empty");
            return;
        }
        for(int i = front;i<=rear;i++)
        {
            System.out.print(queue[i]);
            System.out.print("  ");
        }

    }
    public int peak()
    {
        return queue[rear];
    }
    public static void  main(String[]args)
    {
        practicequeue que = new practicequeue(5);
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        que.displayqueue();
        que.dequeue();
        que.dequeue();
        System.out.println();
        que.displayqueue();
        System.out.println("top element is  : "+que.peak());

    }
}