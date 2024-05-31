
//TO FIND THE INDEXED OF AN SEARCH ELEMENT USING LINEAR SEARCH;
import java.io.*;
import java.util.*;

public class array {

    public static int arraysize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int size = sc.nextInt();
        return size;

    }

    public static void inputValues(int size, int element[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element [" + i + "] : ");
            element[i] = sc.nextInt();

        }
    }

    public static int searchelement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the search element : ");
        int search = sc.nextInt();
        return search;
    }

    public static int searchValue(int size, int element[], int search) {
        int i;
        for (i = 0; i < size; i++) {
            if (element[i] == search) {
                return i;
            }
        }
        // System.out.println("index of search element " + search + "is" + i);

        return i;
    }

    public static void output(int search, int i) {

        System.out.println("index of search element " + search + "is" + i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = arraysize();
        int element[] = new int[size];

        inputValues(size, element);
        int search = searchelement();
        int i = searchValue(size, element, search);
        output(search, i);
        System.out.println(element.length);

    }
}
