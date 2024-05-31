package greedtechniques;
import java.util.*;
public class dijktraAlthm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices in a graph : ");
        int vertices = sc.nextInt();
        int dijtraInput[][] = new int[vertices][vertices];
        for(int i = 0 ; i<vertices; i++)
        {
            for(int j = 0 ; j<vertices ; j++)
            {    System.out.println("Enter the weight of"+i+"----->"+j);
            dijtraInput[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the source of a graph : ");
        int src  = sc.nextInt();
        dijtra(dijtraInput, vertices, src);
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
public static void dijtra(int dijtraInput[][] ,int V , int src)
    {
        int array1[] = new int[V];
        boolean array2[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            array1[i] = Integer.MAX_VALUE;
            array2[i] = false;
        }
        array1[src] = 0;
        for (int i = 0; i < V - 1; i++) {
           
            int minIndex = minElement(array1, array2, V);
            array2[minIndex] = true;
            for (int j = 0; j < V; j++)
 
            if (!array2[j] && dijtraInput[minIndex][j] != 0
            && array1[minIndex] != Integer.MAX_VALUE
            && array1[minIndex] + dijtraInput[minIndex][j] < array1[j])
   
            array1[j] = array1[minIndex] + dijtraInput[minIndex][j];
        }
           print(array1, V);      
}
       
        
    
 public static void print(int dist[] ,int V)
{
    System.out.println( "Vertex \t\t Distance from Source");
    for (int i = 0; i < V; i++)
        System.out.println(i + " \t\t " + dist[i]);
}
}


