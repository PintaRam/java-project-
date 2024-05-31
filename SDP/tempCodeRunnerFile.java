import java.util.*;
class Solution {
    public static int compress(char[] chars) {
        int k = 0;
        int y =0,z =1;
        int x =0;
        int count = 0;
        List<Character> list = new ArrayList<Character>();
        if(chars.length == 1)
        {
            return 1;
        }
        list.add(chars[0]);
       list.add('0');
        for(int i = 0;i<chars.length;i++)
        {
            if(list.get(x) != chars[i])
            {
                list.add(chars[i]);
                list.add('0');
                x+=2;
            }
        }
        for(y = 0;y<=list.size()/2;y+=2)
        { for(int j = 0; j<chars.length;j++)
         {
            if(list.get(y) == chars[j])
            {
                count++;
            }
         }
            if(count!=0)
            {
                
                list.set(z,(char)count);
                z+=2;
                count = 0;
            }else
            {
                list.remove(z);
                z+=2;
                count = 0;
            
             }
        
        }
        System.out.println(list)
        return list.size();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] ={'a','a','b','b','c','c','c'};
       int len = compress(arr);
       System.out.println(len);
        
    }
}