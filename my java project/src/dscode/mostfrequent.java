import java.util.*;
public class mostfrequent{
    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        int count = 0;
        int max = count;
        char ch = 'a';
     
        System.out.println("Enter the number :" );
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the String :" );
        String str  = sc.nextLine(); 
        
        for(int i = 0;i<str.length();i++)
        {   char ch1 = str.charAt(i);
            for(int j =0;j<str.length();j++)
            {
                    if(ch1 == str.charAt(j))
                    {
                        count++;
                    }
            }
            if(count>max)
            {
                max = count;
                ch = ch1;
            }
        }
       System.out.println(ch);
    }
}