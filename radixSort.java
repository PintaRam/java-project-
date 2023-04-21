import java.util.*;

public class radixSort {
    public static void inputTheValues(int array[], int size, Scanner sc) {
        System.out.println("Enter the array elements to be sorted : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // entering an array elements
        }
    }

    public static void displayTheSort(int array[]) {
        for (int i = 0; i < array.length; i++) { // displaying an elements in array before and after sorting
            System.out.print(array[i] + "  ");
        }
    }

    public static void swap(int array[], int i) {
        int temp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = temp;
    }

    public static void radixSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i);
                i = 0;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        inputTheValues(array, size, sc);
        System.out.println("Elements before sorting : ");
        displayTheSort(array);
        System.out.println();
        radixSort(array);
        System.out.println("Elements after sorting : ");
        displayTheSort(array);

    }
}
