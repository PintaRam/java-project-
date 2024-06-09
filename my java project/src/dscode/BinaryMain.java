

import java.util.*;

public class BinaryMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    BinaryTree bt = new BinaryTree();
    System.out.println("Enter the number of nodes : ");
    int numNodes = sc.nextInt();
    for (int i = 0; i < numNodes; i++) {
      int ele = rd.nextInt(10, 100);
      bt.root = bt.createTree(ele, bt.root);

    }
    System.out.print("pre- order is :   ");
    bt.preOrder(bt.root);
    System.out.print("\nIn-order is :    ");
    bt.inOrder(bt.root);
    System.out.print("\nPost-order is :   ");
    bt.postOrder(bt.root);
    System.out.println("\nEnter the node to be deleted from the treee : ");
    int key = sc.nextInt();
    bt.root = bt.deleteTheNode(bt.root, key);

    bt.preOrder(bt.root);
    System.out.println();
    bt.inOrder(bt.root);
    System.out.println(

    );
    bt.postOrder(bt.root);
  }

}

class BinaryTree {
  class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node(int data) {
      this.data = data;
      this.leftChild = null;
      this.rightChild = null;
    }

  }

  Node root;

  BinaryTree() {
    root = null;
  }

  Node createTree(int data, Node temp) {
    // Node newNode = new Node(data);
    if (temp == null) {
      temp = new Node(data);
      return temp;
    }
    if (data < temp.data) {
      temp.leftChild = createTree(data, temp.leftChild);
    }
    if (data > temp.data) {
      temp.rightChild = createTree(data, temp.rightChild);
    }
    return temp;
  }

  void preOrder(Node temp) {
    if (temp == null) {
      return;
    }
    System.out.print(temp.data + "\t");
    preOrder(temp.leftChild);
    preOrder(temp.rightChild);
  }

  void inOrder(Node temp) {
    if (temp == null) {
      return;
    }
    inOrder(temp.leftChild);
    System.out.print(temp.data + "\t");
    inOrder(temp.rightChild);
  }

  void postOrder(Node temp) {
    if (temp == null) {
      return;
    }
    postOrder(temp.leftChild);
    postOrder(temp.rightChild);
    System.out.print(temp.data + "\t");
  }

  Node deleteTheNode(Node temp, int key) {
    if (temp == null) {
      return temp;
    }
    if (key < temp.data) {
      temp.leftChild = deleteTheNode(temp.leftChild, key);
    } else if (key > temp.data) {
      temp.rightChild = deleteTheNode(temp.rightChild, key);
    } else {
      if (temp.leftChild == null) {
        return temp.rightChild;
      } else if (temp.rightChild == null) {
        return temp.leftChild;
      }
      Node temp1 = temp.rightChild;
      while (temp1.leftChild != null) {
        temp1 = temp.leftChild;
        temp.data = temp1.data;
      }
      temp.data = temp1.data;
      temp.rightChild = deleteTheNode(temp.rightChild, temp.data);
    }
    return temp;

  }
}
