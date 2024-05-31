package javacode;

import java.util.*;
import java.lang.*;

class addException extends Exception {
    addException() {
        super("odd number exception : ");

    }

    addException(String msg) {
        super(msg);
    }
}

class EvenOdd {
    void halfOf(int num) {
        try {
            if (num % 2 != 0) {
                throw (new addException());

            } else if (num == 0) {
                throw (new addException());
            } else {
                System.out.println("\n\t" + num + "is an even number and its half is :" + (num / 2));
            }
        } catch (addException Ex) {
            System.out.println("\n\t Error " + Ex.getMessage());
        }
        System.out.println("\n\t End of program ");
    }
}

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value : ");
        int num = sc.nextInt();
        EvenOdd Eo = new EvenOdd();
        Eo.halfOf(num);
    }
}
