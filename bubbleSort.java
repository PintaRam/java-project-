package sortingcode;
import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int array[] = new int[size]; // array declaration
        System.out.println("Enter the array elements to be sorted : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // areray elements
        }
        System.out.println("Elements before sorting : ");
        for (int i = 0; i < size; i++) { // elements before sorting
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < size -1; j++) {
                // last elements are already sorted so size - i -1
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                    flag = true;

                }

            }
            if (flag == false)
                break;
        }
        // elements after sorting
        System.out.println("Elements after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
