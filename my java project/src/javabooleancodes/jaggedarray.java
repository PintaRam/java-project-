import java.util.*;

public class jaggedarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rw = sc.nextInt();
        int arr[][] = new int[rw][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the numebr of columns for " + i + "th rows");
            int col = sc.nextInt();
            arr[0] = new int[col];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the  Element of arrays for the location " + i + "," + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }

}
