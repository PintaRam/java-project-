//package javabooleancodes;

// program to perform the operation on sting;
import java.io.*;
import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the  first string name  : ");
        String str1 = sc.nextLine();
        System.out.println("enter the second string name  : ");
        String str2 = sc.nextLine();
        // concatenation
        String str3 = str1 + str2;
        System.out.println(str3);
        // length of a string
        System.out.println("length of a " + str1 + " is" + str1.length() + " \n length of a " + str2 + " is "
                + str2.length() + " \n length of a " + str3 + "is" + str3.length());
        // to print a character of given string
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));

        }
        // to compare two string

        int n = str1.compareTo(str2);
        if (n > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else if (n < 0) {
            System.out.println(str1 + " is less than " + str2);

        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
        // to find the sub subsring of a given string
        System.out.println(str3.substring(0, 10));
    }

}
