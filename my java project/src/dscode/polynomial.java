

import java.util.Scanner;

public class polynomial {
    class Node {
        int coeffient;
        int power;
        Node link;

        Node(int coeffient, int power) {
            this.coeffient = coeffient;
            this.power = power;
            link = null;
        }
    }

    Node head, tail;

    polynomial() {
        head = null;
        tail = null;
    }

    public void coeffAndPowInput(int coeffient, int power) {
        Node newNode = new Node(coeffient, power);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public void displayLinkedList() {
        if (head == null) {
            System.out.println("The list is empty ");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.coeffient + " X^" + temp.power);
                if (temp.link != null) {
                    System.out.print(" + ");
                }
                temp = temp.link;
            }

        }
    }

    public void addComputePoly(polynomial list1, polynomial list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.power == temp2.power) {
                coeffAndPowInput(temp1.coeffient + temp2.coeffient, temp2.power);
                temp1 = temp1.link;
                temp2 = temp2.link;

            } else if (temp1.power > temp2.power) {
                coeffAndPowInput(temp1.coeffient, temp1.power);
                temp1 = temp1.link;

            } else if (temp1.power < temp2.power) {
                coeffAndPowInput(temp2.coeffient, temp2.power);
                temp2 = temp2.link;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        polynomial list1 = new polynomial();
        polynomial list2 = new polynomial();
        polynomial list3 = new polynomial();
        System.out.println("enter the highest power of first polynomial ");
        int highpow1 = sc.nextInt();
        for (int i = highpow1; i >= 0; i--) {
            System.out.println("Enter the coeffient of X^" + i + "  first polynomial : ");
            int coeff = sc.nextInt();
            list1.coeffAndPowInput(coeff, i);
        }
        System.out.println("enter the highest power of second polynomial ");
        int highpow2 = sc.nextInt();
        for (int i = highpow2; i >= 0; i--) {
            System.out.println("Enter the coeffient of X^" + i + "  first polynomial : ");
            int coeff = sc.nextInt();
            list2.coeffAndPowInput(coeff, i);
        }
        System.out.println("first polynomial is :    ");
        list1.displayLinkedList();
        System.out.println("\nsecond polynomial is :    ");
        list2.displayLinkedList();
        System.out.println("\n================================================================");
        System.out.println("\naddition of polynomials is :   ");
        list3.addComputePoly(list1, list2);
        list3.displayLinkedList();
    }
}
