package javacode;

import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 12, 8, 3 };
        System.out.println("Unsorted Array :" + Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void bubblesort(int src[]) {
        for (int i = 0; i < src.length; i++) {
            int large = i;
            for (int j = i + 1; j < src.length; j++) {
                if (src[large] > src[j])
                    swap(src, large, j);
                large = j;
            }
        }
    }
}
