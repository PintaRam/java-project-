package greedtechniques;

import java.util.Scanner;

public class binomial {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r  =  sc.nextInt();
        int combArray[][] = new int[n+1][r+1];
        comuteCombination(combArray, n, r);


    }
    public static void comuteCombination(int combArray[][] , int n , int  r) {
        for(int  i = 0 ; i <=n ; i++)
        {
            for(int j = 0 ;j<=r ; j++)
            { if(i >= j){
                if(j == 0 || j == i)
                {
                    combArray[i][j] = 1;
                }
                else
                {
                    combArray[i][j] = combArray[i-1][j-1] + combArray[i-1][j];
                }
            }
            else
            {
                combArray[i][j]  = 0;
            }
        }
        }
        print(combArray, n, r);
    }
    public static void print(int combArray[][] , int n , int r) {
         System.out.print("   r");
         for(int j = 0 ; j<=r ; j++)
        {
             System.out.print("\t"+j);
        }
        System.out.println();
         System.out.println("n");
         
        for(int  i = 0 ; i <=n ; i++)
        {System.out.print(i);
            for(int j = 0 ;j<=r ; j++)
            {   
                System.out.print("   \t"+combArray[i][j] );
            }
            System.out.println();
        }
    }
}
