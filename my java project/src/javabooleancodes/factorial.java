import java.io.*;
import java.util.*;

public class factorial {
    public static int inputTheValues() {
        System.out.println("enter the values for to be find the factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static int calculateFactorial(int n) {
        int sum = 1;
        for (int i = n; i >= 1; i--) {
            sum *= i;
        }

        return sum;

    }

    public static void outputFactorial(int n, int sum) {
        if (n < 0) {
            System.out.println("invalid input");
        } else {
            System.out.println("factorial of " + n + " \tis\t" + sum);
        }
    }

    public static void main(String[] args) {
        int n = inputTheValues();
        int fact = calculateFactorial(n);
        outputFactorial(n, fact);

    }

}
