import java.util.*;

public class mergeSort {
    public static void inputTheValues(char array[], int size, Scanner sc) {
        System.out.println("Enter the array elements to be sorted : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.next().charAt(0); // entering an array elements
        }
    }

    public static void displayTheSort(char array[]) {
        for (int i = 0; i < array.length; i++) { // displaying an elements in array before and after sorting
            System.out.print(array[i] + "  ");
        }
    }

    public static void MergeSort(char array[], int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        MergeSort(array, left, mid); // diving the array int each elements
        MergeSort(array, mid + 1, right);
        Merge(array, left, right, mid);// merging the divided elements

    }

    public static void Merge(char array[], int left, int right, int mid) {
        int n1 = mid - left + 1; // size of first and second temporary elements
        int n2 = right - mid;
        char[] leftArr = new char[n1];
        char[] rightArr = new char[n2];// declaring the temporary array
        for (int i = 0; i < n1; i++) {
            leftArr[i] = array[left + i]; // elements from real array to temporary array
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = array[mid + 1 + j];// elements from real array to temporary array
        }
        int i, j, k;
        i = j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                array[k++] = leftArr[i++]; // cheecking elements greater or lesser
            } else {
                array[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            array[k++] = leftArr[i++]; // enetering the remaining elements from temporary array to
        }
        while (j < n2) // real array
        {
            array[k++] = rightArr[j++];

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        char array[] = new char[size];
        inputTheValues(array, size, sc);
        System.out.println("Elements before sorting : ");
        displayTheSort(array);
        System.out.println();
        int left = 0;
        int right = size - 1;
        MergeSort(array, left, right);
        System.out.println("Elements after sorting : ");
        displayTheSort(array);

    }

}
