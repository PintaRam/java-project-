import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    int reg2;

    void input() {
        System.out.println("reg no ");
        reg2 = sc.nextInt();

    }

    public void displayTheValues() {
        System.out.println("reg number  : " + reg2);

    }
}

public class arrayOfObject {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of student : ");
        int size = read.nextInt();
        // int reg;// , marks2
        student[] obj2 = new student[size];
        for (int i = 0; i < size; i++) {
            obj2[i] = new student();
        }

        for (int i = 0; i < size; i++) {
            obj2[i].input();
        }
        for (int i = 0; i < size; i++) {
            obj2[i].displayTheValues();
        }
        read.close();
    }
}