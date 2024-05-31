package javabooleancodes;

import java.util.*;
import java.io.*;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the number of column :");
        int n = sc.nextInt();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
