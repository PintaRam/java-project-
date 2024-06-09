
import java.util.*;
public class practivielinekedlist
{   Node head;
    public class Node{
        int data;
        Node link;
        Node(int data)
        {
            this.data = data;
            link = null;
        }


    }
    public void insertAtBegin(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
        return;

    }
    public void displayLinkedList()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currnode = head;
        while(currnode !=null)
        {
            System.out.println(currnode.data);
            currnode = currnode.link;
            
        }

    }
    public void removeAtPos(int pos)
    {
        if(pos<1)
        {
            return ;
        }
        if(head == null)
        {
           return;
        }
        if(pos == 1)
        {
           head = head.link;
            return;
        }
        else{
            Node temp = head;
            int  i = 1;
            while(i<pos -1)
            {   
                temp = temp.link;
                i++;
            }
            temp.link = temp.link.link;


        }
    }
    public static void main(String []args)
    {
        practivielinekedlist ll = new practivielinekedlist();
        ll.insertAtBegin(10);
        ll.insertAtBegin(20);
        ll.insertAtBegin(20);
        ll.insertAtBegin(49);
        ll.displayLinkedList();
        System.out.println("deleting");
        ll.removeAtPos(1);
        ll.displayLinkedList();

    }
}