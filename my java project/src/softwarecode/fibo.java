
import java.util.Scanner;

public class fibo {
    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int pre = fibo(n - 1);
        int re = fibo(n - 2);
        return pre + re;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ending value : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

}
