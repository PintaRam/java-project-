
//PROGRAM TO SEARCH AN ELEMNET IN 2D ARRAY AND  FIND AN INDICES OF AN SEARCH  ELEMENT.
import java.io.*;
import java.util.*;

public class Twodimarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns :");
        int colum = sc.nextInt();
        int[][] element = new int[rows][colum];
        System.out.println("enter the array element :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                element[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(element[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter the search element : ");
        int sear = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                if (element[i][j] == sear) {
                    System.out.println("indices of search element : " + i + "and " + j);
                }
            }
        }

    }

}
