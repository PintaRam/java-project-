package softwarecode;
import java.util.*;

public class sumOfNNAtural {
    public static int sumOfNNAtural(int n) {
        if (n == 1)
            return 1;
        return sumOfNNAtural(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value : ");
        int n = sc.nextInt();
        System.out.println(sumOfNNAtural(n));
    }
}
