import java.util.*;

public class jordan {
    public static int n;

    public static void convertoDiagonal(float[][] a, int n) {
        float ratio;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    ratio = a[j][i] / a[i][i];
                    for (int k = 0; k < n + 1; k++) {
                        a[j][k] = a[j][k] - ratio * a[i][k];
                    }

                }
                System.out.println("Itermediate forms");
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < n + 1; y++) {
                        System.out.println(a[x][y]);
                    }
                    System.out.println();
                }
                System.out.println();

            }
        }
    }

    public static void printUnkows(float[][] a, int n) {
        System.out.println("values so unkowns are : ");
        for (int i = 0; i < n; i++) {
            System.out.println("values of variable are " + (a[i][n] / a[i][i]));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of unknowns : ");
        n = sc.nextInt();
        float a[][] = new float[n][n + 1];
        System.out.println("Enter the augumented matrix : ");
        for (int i2 = 0; i2 < n; i2++) {
            for (int j2 = 0; j2 < n + 1; j2++) {
                a[i2][j2] = sc.nextFloat();
            }
        }
        convertoDiagonal(a, n);
        printUnkows(a, n);
    }

}
