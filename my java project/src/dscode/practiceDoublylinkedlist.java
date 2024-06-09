import java.util.*;
public class practiceDoublylinkedlist{
    Node head;
    public class Node{
        Node rlink,llink;
        int data;
        Node(int data)
        {
            this.data = data;
            rlink = null;
            llink = null;
        }
    }
    public void insertAtBegin(int data)
    {  Node newNode = new Node(data);
        if(head ==null)
        {
            head = newNode;
            return;
        }
        newNode.rlink = head;
        head.llink = newNode;
        head = newNode;
    }
    public void displayLinkedList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp !=null)
        {
            System.out.println(temp.data);
            temp = temp.rlink;
        }

    }
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currnode = head;
        while(currnode.rlink!=null)
        {
            currnode = currnode.rlink;
        }
        currnode.rlink = newNode;
        

    }
    public  void insertAtPostion(int data , int pos)
    { Node newNode = new Node(data);
        if(pos<1)
        {
            System.out.println("List is empty");
            return;
        }
        if(head == null)
        {  
            if(pos!=1)
            {
                System.out.println("List is empty");
                return;
            }else{
                head = newNode;
                return;
            }
        }
        Node temp = head;
        int i = 1;
        while(i<pos-1)
        {
            i++;
            temp = temp.rlink;
        }
        if(temp!=null)
        {
            newNode.rlink = temp.rlink;
            temp.rlink = newNode;
        }
    }
    public static void main(String[] args)
    {
        practiceDoublylinkedlist ll = new practiceDoublylinkedlist();
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
        ll.insertAtPostion(80,3);
        ll.displayLinkedList();
    }

}