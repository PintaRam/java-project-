package greedtechniques;

import java.util.Scanner;

public class floydlgorith {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the vertices of directed graph  : "); // input of number of vertices
    int vertices =  sc.nextInt();
    int  floyd[][] = new int[vertices][vertices]; // declaration of array
    System.out.println();
    System.out.println("NOTE :  if there no path then enter the value as 65437 \n       and if ai ------> ai then enter as 0 \n       else enter the weight if given");
   System.out.println("\n");
    for(int i = 0 ; i<vertices; i++)
        {
            for(int j = 0 ; j<vertices ; j++)
            {    System.out.println("Enter the weight of"+i+"----->"+j); //input of graph using nxn matrices
                floyd[i][j] = sc.nextInt();
                
            }
        }
        floyd(vertices, floyd);
    }
   
 public static int minimum(int value1  , int value2) {
    if(value1 > value2)
        return value2;
    else
        return value1;
}
public static void floyd(int vertices , int floyd[][]) {
    for(int i = 0 ; i <vertices ; i++)   // first loop for privous matrix
    {
        for(int j = 0 ; j <vertices ; j++) // this two loop for current matrix
        {
             for(int k = 0 ; k<vertices ; k++)
             {
                floyd[j][k] = minimum(floyd[j][k],  floyd[j][i] + floyd[i][k]);  // r(k)[j , k] = min (r(k-1)[j , k] , (r(k-1)[j , i] + r(k-1)[i , k]))
             }
        } 
      
    }
}
    public static void print(int vertices ,  int floyd[][]) {
        for(int i = 0 ; i <vertices ; i++)
        {
            for(int j = 0 ; j <vertices ; j++)
            {
                System.out.print(floyd[i][j] +"     "); // print the matrix
            }
            System.out.println();
        }
    }
}