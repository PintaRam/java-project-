import java.util.*;
import java.io.*;

import javax.net.ssl.SSLContext;

public class randomnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int array2[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(0, 9999);
        }
        int sum = 0;
        int rem, flag = 0;
        // for (int i = 0; i < size; i++) {
        // System.out.println(array[i]);
        // }
        for (int i = 0; i < size; i++) {
            StringBuilder temp = new StringBuilder(String.valueOf(array[i]));
            StringBuilder temp2 = new StringBuilder(String.valueOf(array[i]));
            // while (temp > 0) {
            // rem = temp % 10;
            // sum = (sum * 10) + rem;
            // temp = temp / 10;
            // }
            temp.reverse();

            if (temp == temp2) {
                array2[i] = array[i];
                flag++;
            }

        }
        if (flag != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("palindrome number is");
                System.out.println(array2[i]);

            }
        } else {

            System.out.println("palindrome number doesn't exit");
        }
    }
}
