import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int array[] = new int[size]; // array declaration
        System.out.println("Enter the array elements to be sorted : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // array elements
        }
        System.out.println("Elements before sorting : ");
        for (int i = 0; i < size; i++) { // elements before sorting
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            boolean flag = false;
            for (int j = i + 1; j < size; j++) {
                // every time we need to check only size - i elements
                if (array[min] > array[j]) {
                    min = j;
                    flag = true;
                }

            }
            if (flag) {
                int temp = array[min];
                array[min] = array[i]; // swaping if flag is true
                array[i] = temp;
            }  

        }
        // elements after sorting
        System.out.println("Elements after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
