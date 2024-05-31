package javacode;
import java.util.*;

public class genericMethod {
    public static <T> int count(ArrayList <T> list)
    {    int Count = 0 ;
        for(int i= 0 ;  i<list.size(); i++)
        { 
          if((int) list.get(i)% 2 !=0)
          {
             Count++;
          }
        }
        return Count;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of elements to be entered : ");
        int n  = sc.nextInt();
        for(int i = 0; i<n ; i++)
        {
            System.out.println("Enter the  element : ");
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println("number of odd number in arraylist collection is : " + count(list));
         
    }
    
}
