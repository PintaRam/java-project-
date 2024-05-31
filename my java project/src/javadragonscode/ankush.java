import java.util.*;
import java.io.*;

public class ankush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower value : ");
        int m = sc.nextInt();
        System.out.println("Enter the upper value : ");
        int n = sc.nextInt();
        // for (int i = m; m <= 9 && m <= n; m++) {
        // switch (m) {
        // case 1:
        // System.out.println("one");
        // break;

        // case 2:
        // System.out.println("two");
        // break;

        // case 3:
        // System.out.println("three");
        // break;

        // case 4:
        // System.out.println("four");
        // break;

        // case 5:
        // System.out.println("five");
        // break;

        // case 6:
        // System.out.println("six");
        // break;
        // case 7:
        // System.out.println("seven");
        // break;

        // case 8:
        // System.out.println("eight");
        // break;

        // case 9:
        // System.out.println("nine ");
        // break;

        // default:
        // break;
        // }
        // }
        // for (int i = m; m > 9 && m <= n; m++) {

        // if (m % 2 == 0) {
        // System.out.println("even ");

        // } else {
        // System.out.println("odd");
        // }
        //
        // }
        String[] numbers = { " ", "one ", "two", "three ", "four", "five", "six", "seven", " eight", "nine" };
        for (int i = m; m <= 9 && m <= n; m++) {
            System.out.println(numbers[m]);
        }
        for (int i = m; m > 9 && m <= n; m++) {

            if (m % 2 == 0) {
                System.out.println("even ");

            } else {
                System.out.println("odd");
            }
        }

    }

}
