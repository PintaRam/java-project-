import java.util.*;

public class squareroot {
    public static double Mysrt(double x, double l) {
        double temp = x;
        while (Math.abs(temp - x) < l) {
            temp = 0.5 * (temp + (x / temp));

        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you need to find an square root :");
        double x = sc.nextDouble();
        double l = 0.00001;
        double y = Mysrt(x, l);
        System.out.println(y);
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number for which you need to find an square
    // root :");
    // float x = sc.nextInt();
    // float y = x;
    // for (int i = 0; i < x; i++) {
    // y = (y + (x / y)) / 2;
    // }
    // System.out.println(y);

    // }

}
