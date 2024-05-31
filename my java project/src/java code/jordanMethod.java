import java.util.*;
import java.lang.*;

public class jordanMethod {
    public static void inputTheMatrixElement(float array[][], Scanner sc) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("Enter the a" + i + j + " element of a equation :");
                array[i][j] = sc.nextFloat();
            }
        }

    }

    public static void displayTheEquation(float array[][]) {
        System.out.println("yours entered equation are : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (j == 3) {
                    System.out.print(" = " + array[i][j]);
                } else {
                    System.out.print(array[i][j] + "X" + j);
                }
                if (j != 2 && j != 3) {
                    System.out.print("  +  ");
                }
            }
            System.out.println();

        }

    }

    public static void manipulateTheMatrix(float array[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // float temp2 = array[j][i] / array[i][i];
                if (j != i) {
                    float temp = array[j][i] / array[i][i];
                    for (int k = 0; k < 4; k++) {
                        array[j][k] = array[j][k] - temp * array[i][k];
                    }

                }

                System.out.println("Itermediate forms are ");
                // System.out.println("R" + j + " --> R" + j + " - " + temp2 + "R" + i);

                for (int p = 0; p < 3; p++) {
                    for (int b = 0; b < 4; b++) {
                        System.out.print(array[p][b]);
                    }
                    System.out.println();
                }
                System.out.println();

            }
        }

    }

    public static void displayTheValues(float a[][]) {
        for (int i = 0; i < 3; i++) {
            System.out.println("values of x" + i + "  =  " + a[i][3] / a[i][i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float array[][] = new float[3][4];
        inputTheMatrixElement(array, sc);
        displayTheEquation(array);
        manipulateTheMatrix(array);
        displayTheValues(array);

    }
}
