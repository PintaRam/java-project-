import java.util.*;

class quickSort {
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

    public static void quickSort(int array[], int st, int end) {
        if (st >= end) {
            return;
        }
        int pi = partition(array, st, end);
        quickSort(array, st, pi - 1);
        quickSort(array, st + pi + 1, end);
    }

    public static void swap(int array[], int st, int pivotIdx) {
        int temp = array[st];
        array[st] = array[pivotIdx];
        array[pivotIdx] = temp;
    }

    public static int partition(int array[], int st, int end) {
        int pivot = array[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (array[i] <= pivot) {
                count++;
            }
        }
        int pivotIdx = st + count;
        swap(array, st, pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (array[i] <= pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                swap(array, i, j);
                i++;
                j--;
            }

        }
        return pivotIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int array[] = new int[size]; // array declaration
        inputTheValues(array, size, sc);
        System.out.println("Elements before sorting : ");
        displayTheSort(array);
        System.out.println();
        quickSort(array, 0, size - 1);
        System.out.println();
        displayTheSort(array);

    }
}
