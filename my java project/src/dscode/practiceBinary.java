import java.util.*;
public class practiceBinary{
   static Node  root = null;
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left =null;
            right = null;

        }
    }
    public Node createTree(int data,Node temp)
    {
        if(temp  == null)
        {
            temp = new Node(data);
            return temp;
        }
        if(data<temp.data)
        {
            temp.left = createTree(data, temp.left);
        }
        if(data>temp.data)
        {
            temp.right =createTree(data,temp.right);
        }
        return temp;
    }
    public void preOrder(Node temp)
    {
        if(temp == null)
        {
           // System.out.println("Tree empty");
            return;
        }
        System.out.print(temp.data+" ");
        preOrder(temp.left);
        preOrder(temp.right);
    }
    public Node insertNode(int data,Node temp)
    {
        if(temp == null)
        {
            temp = new  Node(data);
            return temp;
        }
        if(data<temp.data)
        {
            temp.left = insertNode(data,temp.left);
        }
        if(data>temp.data)
        {
            temp.right = insertNode(data,temp.right);
        }
        return temp;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of nodes :");
        int nodes = sc.nextInt();
        practiceBinary bt = new practiceBinary();
        for(int i = 0;i<nodes;i++)
        {   System.out.println("Enter the elements : ");
            int ele = sc.nextInt();
            root = bt.createTree(ele, root);
        }
        bt.preOrder(root);
        System.out.println("Enter the element of nodes :");
        int ele = sc.nextInt();
        root =bt.insertNode(ele,root);
        bt.preOrder(root);

    }
}