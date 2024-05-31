package javadragonscode;

import java.util.*;

public class swapTwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second value :");
        int b = sc.nextInt();
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping the code the values become  :");
        System.out.println("a =" + a);
        System.out.println("b = " + b);

    }

}
