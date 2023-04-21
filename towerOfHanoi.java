
import java.util.Scanner;

public class towerOfHanoi {
    public static void towerOfHanoi(int Disks, char A, char C, char B) {
        if (Disks == 0) {
            return;
        }
        towerOfHanoi(Disks - 1, A, B, C);
        System.out.println("Move disk " + Disks + " from rod " + A + " to rod " + C);
        towerOfHanoi(Disks - 1, B, C, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Disks : ");
        int Disks = sc.nextInt();
        towerOfHanoi(Disks, 'A', 'C', 'B');
    }

}
