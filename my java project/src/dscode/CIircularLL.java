package dscode;
import java.util.Scanner;
public class CIircularLL {
    class Node {
        int data;
        Node link;

        Node(int d) {
            data = d;
            link = null;
        }
    }

    Node head, tail;

    CIircularLL() {
        head = null;
        tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;
        tail.link = newNode;
    }

    public void addAtlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        tail.link = newNode;
        newNode.link = head;
        tail = newNode;
        

    }

    public void addAfterKey(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node temp = tail.link;
        
        do {

            if (temp.data == key) {
                newNode.link = temp.link;
                temp.link = newNode;
                return;
            }
            // if (temp == tail) {
            //     tail.link = newNode;
            //     newNode.link = head;
            //     return;
            // }
            temp = temp.link;
        } while (temp != tail.link);

    }
    public void addBeforeKey(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        if(head.data == key)
        {
            newNode.link = head;
             head = newNode;
             tail.link = newNode;
        }
        Node temp = head;
        
        do {

            if (temp.link.data == key) {
                newNode.link = temp.link;
                temp.link = newNode;
                return;
            }
            
            temp = temp.link;
        } while (temp != tail.link);

    }

    public void displayLinkedList() {
        if (head == null) {
            System.out.println("linked list is empty ");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "--->");
            temp = temp.link;
        } while (temp != head);
    }
    public void removeafterKey(int key)
    {
       if(head == null)
       {
        System.out.println("list is empty ");
        return;
       }
    
   
    Node temp = head;
    do{
     
      if(tail.data == key)
      {
        head = head.link;
        tail.link = head;
        return;
      }
      if(temp.data == key)
      {
        temp.link = temp.link.link;
        return;
      }
      temp = temp.link;
    }while(temp != tail.link);

    }
    public void removebeforeKey(int key)
    {
       if(head == null)
       {
        System.out.println("list is empty ");
        return;
       }
        if(head.link.data == key)
        {
            head = head.link;
            tail.link = head;
            return;

        }
        Node temp = head;
        do {
            if(temp.link.link.data == key)
            {
                temp.link = temp.link.link;
                return;
            }
            temp = temp.link;
        }while(temp != tail.link);
    
   
  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CIircularLL list = new CIircularLL();
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the starting input values : ");
            int d1 = sc.nextInt();
            list.addFirst(d1);

        }
        list.displayLinkedList();
        System.out.println("Enter the last input values : ");
        int d2 = sc.nextInt();
        list.addAtlast(d2);
        list.displayLinkedList();
        System.out.println();
        // System.out.println("\nEnter the key and data of add after key method : ");
        // int key = sc.nextInt();
        // int d3 = sc.nextInt();
        // list.addAfterKey(key, d3);
        // list.displayLinkedList();
        // System.out.println("\nEnter the key and data of add before key method : ");
        // int key2 = sc.nextInt();
        // int d4 = sc.nextInt();
        // list.addBeforeKey(key2 ,  d4);
        // list.displayLinkedList();
        System.out.println("Enter the key need to be removed  after key : ");
        int d5 = sc.nextInt();
        list.removeafterKey(d5);
        list.displayLinkedList();
    //     System.out.println();
    //     System.out.println("enter the elements to be removed before key : ");
    //     int a = sc.nextInt();
    //     list.removebeforeKey(a);
    //     list.displayLinkedList();
     }

}