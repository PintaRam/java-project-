import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class function {
    public static int inputTheValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int n = sc.nextInt();
        return n;

    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void printSum(int a, int b, int sum) {

        System.out.println("sum of " + a + "+" + b + "=" + sum);

    }

    public static void main(String[] args) {

        int a = inputTheValues();
        int b = inputTheValues();
        int sum = calculateSum(a, b);
        printSum(a, b, sum);

    }
}
