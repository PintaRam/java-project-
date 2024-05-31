import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum value of fibonacci series :");
        int n = sc.nextInt();
        int sum = 1, a = 0, b = 1;
        System.out.println(a);
        for (int i = 2; sum <= n; i++) {
            System.out.println(sum);
            sum = a + b;
            a = b;
            b = sum;

        }
    }

}
