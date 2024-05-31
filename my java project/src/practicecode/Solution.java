import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int count=1;
        char [] chars = {'a','a','b','b'};
        int j= 1;
        char arr[] = new char[6] ;
         if(chars.length  == 1)
            {
                System.out.println(chars);
            }
            arr[0]= chars[0];
        for(int i = 1;i<chars.length;i++)
        {       if(chars[i] == chars[i-1])
                {
                    count++;
                    System.out.println(count);
                    continue;
                    
                }
               
            
            if(count>1)
            {   // System.out.println(count);
                arr[j++] = 'x';
                count=1;
            }
            if(chars[i] != chars[i-1])
            {
                arr[j++] = chars[i];
            }
        }
        System.out.println(arr);

    }
        
    
}
