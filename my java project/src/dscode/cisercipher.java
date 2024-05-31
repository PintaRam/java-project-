package dscode;

import java.util.*;
public class cisercipher {
    public static void main(String[] args) {
        int key =5;
        String s = "let us meet at midnight";
        char [] ch =  s.toCharArray();
        for(char c  : ch)
        {
            c += key;
            System.out.print(c);
        }
        System.out.println();
    }
    
}
