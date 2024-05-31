package greedtechniques;

import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the maximum capacity of sack : ");
        int capacity = sc.nextInt();
        System.out.println("Enter the number of items : ");
        int item = sc.nextInt();
        int weight[] = new int[item+1];
        int value[] = new int[item + 1];
        int knapsackarray[][] = new int[item+1][capacity+1];
        for(int i = 0 ; i<=item; i++)
        {   System.out.println("Enter the weight of W"+i);
            weight[i] = sc.nextInt();
        }
        for(int i = 0 ; i<=item; i++)
        {   System.out.println("Enter the value of V"+i);
            value[i] = sc.nextInt();
        }
knapsack(knapsackarray, weight, value, item, capacity);

    }
 public static int maxValueOf(int value1 , int value2)
 {
   if(value1 > value2)
        return value1;
    else
        return value2;
 }
    public static void knapsack(int knapsackarray[][] , int weight[] , int value[] , int item ,  int capacity) {
            for(int i = 0 ; i<=item ; i ++)
            {
                for(int j = 0 ; j <= capacity;j++)
                {
                    if(i == 0 || j == 0)
                    {
                        knapsackarray[i][j] = 0;
                    }
                    else {
                        knapsackarray[i][j] = -1;
                    }
                }
            }
            for(int i = 0 ; i<=item ; i ++)
            {
                for(int j = 0 ; j <= capacity;j++)
                {
                   if(knapsackarray[i][j] < 0)
                   {
                    if(j<weight[i])
                    {
                        knapsackarray[i][j] = knapsackarray[i-1][j];
                    }
                    else 
                    {
                        knapsackarray[i][j] = maxValueOf(knapsackarray[i-1][j] , knapsackarray[i-1][j-weight[i]]+value[i]);
                    }
                   }
                }
            }
            
            print(knapsackarray, capacity, item);
        
    }
    public static void print(int knapsackarray[][] , int capacity , int item) {
        for(int i = 0 ; i<=item; i ++)
        {
            for(int j = 0 ; j <= capacity;j++)
            {
                System.out.print(knapsackarray[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
