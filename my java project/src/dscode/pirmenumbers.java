package dscode;
import java.util.*;

public class pirmenumbers {
   

public static void main(String[ ] args) 
   	{
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of an array : ");
    int size  = sc.nextInt();
   int [] array = new int[size];
   for(int i = 0 ; i <size ; i++)
{
    array[i] = sc.nextInt();
}
    
    for(int i = 0 ; i<size; i++)
    {  int n = array[i];
        if(isprime(n))
        System.out.println(" "+array[i]);
    }
   

}
public static boolean isprime(int n )
{
    if(n == 1)
    return false;
    for(int i = 2 ; i<=Math.sqrt(n); i++)
    {
        if(n%i == 0)
        return false;
    }
    return true;
}
}
    

