package greedtechniques;

import java.util.Scanner;

public class prismAlrth {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in a graph : ");
        int vertices = sc.nextInt();
        int prismInput[][] = new int[vertices][vertices];
        for(int i = 0 ; i<vertices; i++)
        {
            for(int j = 0 ; j<vertices ; j++)
            {    System.out.println("Enter the weight of"+i+"----->"+j);
                prismInput[i][j] = sc.nextInt();
            }
        }


  prism(prismInput,vertices);                        
                        
}
public static int minElement(int array1[], boolean array2[] , int V)
{
   
    int min = Integer.MAX_VALUE, minIndex = -1;

    for (int i = 0; i < V; i++)
        if (array2[i] == false &&array1[i] < min) {
            min = array1[i];
            minIndex = i;
        }

    return minIndex;
}                    
public static void prism(int prismInput[][] ,int V)
    {
        int array[] = new int[V];
        int array1[] = new int[V];
        boolean array2[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            array1[i] = Integer.MAX_VALUE;
            array2[i] = false;
        }
        array1[0] = 0;
       
        
        array[0] = -1;
        for (int i = 0; i < V - 1; i++) {
           
            int minIndex = minElement(array1, array2, V);
            array2[minIndex] = true;
            for (int j = 0; j < V; j++)
 
                if (prismInput[minIndex][j] != 0 && array2[j] == false
                    && prismInput[minIndex][j] < array1[j]) {
                    array[j] = minIndex;
                    array1[j] = prismInput[minIndex][j];
                }
        }
        printMST(array, prismInput, V);
        
    }
 public static  void printMST(int parent[], int graph[][], int V)
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + "----->" + i + "\t"
                               + graph[i][parent[i]]);
    }
}
