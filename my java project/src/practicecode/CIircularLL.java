import java.util.List;

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

    public void addNode(int d) {
        // Create a new node
        Node newNode = new Node(d);

        // Checks if the list is empty
        if (tail == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            newNode.link = tail.link;
            // newNode will become new tail of the list
            tail.link = newNode;
        }
    }

    public void deletekey(int key) {
        if (tail == null) {
            System.out.println("list is empty");
            return;
        }
        if (tail.link.data == key) {
            tail.link = tail.link.link;
            return;
        }
        Node temp = tail.link;
        while (temp != null) {
            if (temp.data == key) {
                temp = temp.link.link;
                return;
            }
            temp = temp.link;
        }
        return;

    }

    public void addatlast(int d) {
        Node newNode = new Node(d);
        if (tail == null) {
            tail = newNode;
            return;
        }

        Node temp = tail.link;
        while (temp != tail) {
            temp = temp.link;
        }
        newNode.link = temp.link.link;
        tail = newNode;
    }

    public void addafterKey(int key, int d) {
        Node newNode = new Node(d);
        if (tail == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = tail.link;
        while (temp != tail) {
            if (temp.data == key) {
                newNode.link = temp.link;
                temp.link = newNode;
                // newNode.link = temp.link;

                return;
            }
            temp = temp.link;
        }
        return;
    }

    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
        // System.out.println(tail.link);
    }

    public static void main(String[] args) {
        CIircularLL list = new CIircularLL();
        // list.addatlast(5);
        // list.addatlast(6);
        list.addNode(44);
        list.addNode(6);
        list.addafterKey(6, 20);
        // list.deletekey(6);
        list.display();
    }
}
