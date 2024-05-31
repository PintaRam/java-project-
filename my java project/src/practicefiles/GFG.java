package practicefiles;

import java.util.*;



class GFG {

   
    public static void main(String args[]) {
        int x = 1234;
 int y = 0;
 while(x!= 0)
 {
    y = (y*10)+(x%10);
    x = x/10;
 }
 System.out.println(y);
}
    }


