import java.util.*;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int order;
        System.out.println("Mtarix multiplication of same order ");
        System.out.print("Enter the order : ");
        order = read.nextInt();
        Matrix A = new Matrix(order);
        Matrix B = new Matrix(order);
        System.out.println("Enter the elements of 1st Matrix : ");
        A.readMat(read);
        System.out.println("Enter the elemenst of 2nd Matrix : ");
        B.readMat(read);
        Matrix C = A.matMultiply(B);
        System.out.println("1st Matrix :");
        A.printMat();
        System.out.println("2nd matrix : ");
        B.printMat();
        System.out.println("product Matrix : ");
        C.printMat();
        read.close();

    }

}

class Matrix {
    int mat[][];
    int row, col;

    Matrix() {
        mat = null;
        row = col = 0;
    }

    Matrix(int order) {
        mat = new int[order][order];
        row = col = order;
    }

    void readMat(Scanner read) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat[r][c] = read.nextInt();

            }
        }
    }

    void printMat() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }

    Matrix matMultiply(Matrix m) {
        Matrix prod = new Matrix(this.row);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                prod.mat[i][j] = 0;
                for (int k = 0; k < this.row; k++) {
                    prod.mat[i][j] = prod.mat[i][j] + this.mat[i][k] * m.mat[k][j];
                }
            }
        }
        return prod;
    }
}
