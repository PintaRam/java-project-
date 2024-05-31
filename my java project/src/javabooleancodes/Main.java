import java.util.Scanner;

class student {
    static Scanner sc = new Scanner(System.in);

    static int takeinput() {
        System.out.println("reg no ");
        return sc.nextInt();

    }

    static void displayTheValues(int i) {
        System.out.println("reg number  : " + i);

    }

}

public class Main extends student {
    public static void main(String[] args) {

        System.out.println("Enter the number of student : ");
        int size = sc.nextInt();
        // int reg;// , marks2

        int[] obj2 = new int[size];

        for (int i = 0; i < size; i++) {

            obj2[i] = takeinput();
        }
        for (int i = 0; i < size; i++) {
            displayTheValues(obj2[i]);
        }

    }
}