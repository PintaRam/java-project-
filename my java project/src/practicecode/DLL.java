import java.util.*;
import java.lang.*;

class Node {
    String data;
    Node llink;
    Node rlink;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data ");
        data = sc.nextLine();
        // rlink = llink = null;
    }
}

public class DLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        Node head = null;
        Node temp = head;
        Node[] newnode = new Node[n];
        for (int i = 1; i < n; i++) {
            newnode[i] = new Node();
        }
        for (int i = 1; i < n; i++) {
            newnode[i].input();
            if (i == 1) {
                newnode[i].llink = head;
                head = newnode[i];
                temp = head;
            } else {
                newnode[i].llink = temp;
                temp.rlink = newnode[i];
                temp = temp.rlink;
            }
            System.out.println(temp.data);

        }

        sc.close();
    }
}