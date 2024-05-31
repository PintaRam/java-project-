import java.util.*;

public class SparseMatrixApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2D array format for sparse Matrix : ");
        System.out.println("Enter the number of rows :");3
        int rw = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cl = sc.nextInt();
        int sparseMatrix[][] = new int[rw][cl];
        // read sparse matrix in 2 -d array
        System.out.println("Enter the values of matrix :");
        for (int row = 0; row < rw; row++) {
            for (int column = 0; column < cl; column++) {
                sparseMatrix[row][column] = sc.nextInt();

            }
        }
        // find total non zero values in the sparse matrix
        int size = 0;
        for (int row = 0; row < rw; row++) {
            for (int column = 0; column < cl; column++) {
                if (sparseMatrix[row][column] != 0) {
                    size++;
                }
            }
        }
        // defining result matrix
        int resultMatrix[][] = new int[3][size];
        // generating result matrix
        int k = 0;
        for (int row = 0; row < rw; row++) {
            for (int column = 0; column < cl; column++) {
                if (sparseMatrix[row][column] != 0) {
                    resultMatrix[0][k] = row;
                    resultMatrix[1][k] = column;
                    resultMatrix[2][k] = sparseMatrix[row][column];
                    k++;
                }
            }

        }
        // displaying result matrix
        System.out.println("Triplet Representation :");
        for (int row = 0; row < 3; row++) {
            if (row == 0) {
                System.out.println("row  : \t");
            }
            if (row == 1) {
                System.out.println("column : \t");
            }
            if (row == 2) {
                System.out.println("value : \t");
            }
            for (int column = 0; column < size; column++) {
                System.out.print(resultMatrix[row][column]);
                System.out.println();
            }
        }
        // searching an element in sparse matrix
        System.out.println("Enter the element to be searched in sparse matrix :");
        int ele = sc.nextInt();
        int flag = 0;
        for (int index = 0; index < size; index++) {
            if (resultMatrix[2][index] == ele) {
                System.out
                        .println("Element found at (" + resultMatrix[0][index] + " , " + resultMatrix[1][index] + ")");
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.println("Elements not found ");

        }
        sc.close();
    }

}
