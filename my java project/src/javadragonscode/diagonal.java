import java.util.*;
import java.io.*;

public class diagonal {
    public static int numberOFrows() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows  : ");
        int r = sc.nextInt();
        return r;
    }

    public static int numberOfColumns() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        return c;

    }

    public static void arrayElements(int r, int c, int mat[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements of matrix of order " + r + "x" + c + ": ");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void diagonalElemnents(int r, int c, int mat[][]) {
        System.out.println("diagonal elemens of matrix of order " + r + " x" + c + "are ");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + "   ");
                }

            }

        }

    }

    public static void boundaryElements(int r, int c, int mat[][]) {
        System.out.println("boundary elements of matrix of order " + r + "x " + c + "are");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r = numberOFrows();
        int c = numberOfColumns();
        int mat[][] = new int[r + 1][c + 1];
        arrayElements(r, c, mat);
        diagonalElemnents(r, c, mat);
        System.out.println();
        boundaryElements(r, c, mat);
    }
}
