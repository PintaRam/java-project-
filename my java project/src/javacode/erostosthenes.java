package javacode;
import java.io.*;
import java.util.*;

public class erostosthenes {
    public static int arraySize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size  : ");
        int n = sc.nextInt();
        return n;
    }

    public static void arrayElements(int n, int a[]) {
        for (int i = 2; i <= n; i++) {
            a[i] = i;
        }
    }

    public static void Sievemethod(int n, int a[]) {
        for (int i = 2; i * i <= a.length - 1; i++) // if i = 2 ; i*i = 4; 4<5
        {
            if (a[i] != -1) {
                // Mark all the multiples of i as -1.
                for (int j = i * i; j <= a.length - 1; j += i) {
                    a[j] = -1;
                }
            }
        }

    }

    public static void output(int n, int a[]) {
        if (n >= 2) {
            System.out.println("prime numbers are ");
            for (int i = 2; i <= a.length - 1; i++) {
                if (a[i] != -1) {
                    System.out.print(i + " ");
                }

            }

        } else {
            System.out.println("prime numbers doesn't exit  : ");
        }

    }

    public static void main(String[] args) {

        int n = arraySize();
        int[] a = new int[n + 1];
        arrayElements(n, a);
        Sievemethod(n, a);
        output(n, a);

    }

}
