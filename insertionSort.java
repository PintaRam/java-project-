import java.util.*;

public class insertionSort {
   
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
        for(int i = 1 ; i<size ;i++)
        {
            
        }
        // elements after sorting
        System.out.println("Elements after sorting : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}

