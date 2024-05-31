package dscode;
import java.util.*;

class palindrome {
    public static boolean checkPallidrome(String a) {

        for (int j = 0; j < a.length() / 2; j++) {
            if (a.charAt(j) != a.charAt(a.length() - j - 1)) {
                return false;
            }

        }

        return true;
    }

    public static int arraySize() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        return size;
    }

    public static void arrayRandomEle(int size, int[] arr) {
        Random rd = new Random();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(1000, 10000);

            String b = Integer.toString(arr[i]);
            if (checkPallidrome(b)) {
                System.out.print(arr[i] + "  ");
                flag++;
            }

        }
        if (flag == 0) {
            System.out.println("paindrome number does not exits in this random array list");
        }

    }

    public static void main(String[] args) {
        int size = arraySize();
        int[] array = new int[size];
        arrayRandomEle(size, array);

    }

}
