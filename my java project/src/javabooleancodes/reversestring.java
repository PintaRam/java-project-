package javabooleancodes;
// import java.io.*;

// import java.util.*;

// public class reversestring {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the main string  : ");
//         String str = sc.nextLine(); // input the string
//         int n = str.length(); // length of a string
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.print(str.charAt(i));
//         }

//     }

// }
import java.util.*;
import java.io.*;

public class reversestring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string   : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <= sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
