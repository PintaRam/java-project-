import java.util.*;

public class fastinating {
    public static int inputTheValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that need to find the number as fastinating or not : ");
        int a = sc.nextInt();
        sc.close();
        return a;

    }

    public static int calculation(int a, int x) {
        int p;
        if (x == 0) {
            p = a * 2;
        } else {
            p = a * 3;
        }
        return p;

    }

    public static String intToStr(int a, int b, int c) {
        String str = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
        return str;

    }

    public static int verifyForFastinating(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void output(int a, int count) {
        if (count > 1) {
            System.out.println(a + " is not a fastinating number");
        } else {
            System.out.println(a + " is  fastinating number ");
        }
    }

    public static void main(String[] args) {
        int a = inputTheValues();
        int x = 0;
        int b = calculation(a, x);
        x = 1;
        int c = calculation(a, x);
        String str = intToStr(a, b, c);
        int count = verifyForFastinating(str);
        output(a, count);
    }

}
