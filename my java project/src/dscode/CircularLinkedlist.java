import java.util.*;
public class CircularLinkedlist
{   
    Node head,tail;
    public class Node
    { 
        int data;
        Node link;
        Node(int data)
        {
            this.data =data;
            link = null;
        }
    }
    public void insertAtBegin(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            head= newNode;
            tail = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
        tail.link = newNode;
    }
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.link = head;
        tail.link = newNode;
        tail = newNode;
    }
    public void displayLinkedList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do
        {
            System.out.println(temp.data);
            temp = temp.link;
        }while(temp != tail.link);

    }
    public void addbeforeKey(int data,int key)
    {   Node newNode = new Node(data);
        if(head == null)
        {
            System.out.println("List does not exits");
            return;
        }
        if(key == head.data)
        {
            newNode.link = head;
            head = newNode;
            tail.link = newNode;
            return;
        }
        Node temp = head;
        do
        {
            if(key == temp.link.data)
            {
                newNode.link = temp.link;
                temp.link =newNode;
                return;
            }
            temp =temp.link;
        }while(temp != tail.link);
    }
    public static void main(String[] args)
    {
        CircularLinkedlist ll = new CircularLinkedlist();
        ll.insertAtBegin(10);
        ll.insertAtBegin(29);
        ll.insertAtBegin(29); 
        ll.insertAtBegin(29);
        ll.displayLinkedList();
        ll.insertAtLast(50);
        System.out.println("Ram aayega to sita bhi ayegi");
        ll.insertAtBegin(100);
        ll.displayLinkedList();
        System.out.println("Ram aayega to sita bhi ayegi");
        ll.addbeforeKey(20,10);
        ll.displayLinkedList();
    }

}