import java.io.*;
import java.util.*;

public class simplecalcutors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number  : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();
        System.out.println("enter the operation need to be performed on the numbers {- ,+,*,/} : ");
        String ch = sc.next();
        switch (ch) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid input ");
        }

    }

}
