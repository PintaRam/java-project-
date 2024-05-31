package greedtechniques;
// warshell algorithm is valid for unweighted graph
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;



public class transitiveClosures {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the vertices of directed graph  : "); // input of number of vertices
    int vertices =  sc.nextInt();
    int  adcenMatrix[][] = new int[vertices][vertices]; // declaration of array
    for(int i = 0 ; i<vertices; i++)
        {
            for(int j = 0 ; j<vertices ; j++)
            {    System.out.println("Enter the weight of"+i+"----->"+j); //input of graph using nxn matrices
                adcenMatrix[i][j] = sc.nextInt();
                
            }
        }
      
        transitive(vertices, adcenMatrix);
}
public static void transitive(int vertices , int adcenMatrix[][]) {
    for(int i = 0 ; i <vertices ; i++)   // first loop for privous matrix
    {
        for(int j = 0 ; j <vertices ; j++) // this two loop for current matrix
        {
             for(int k = 0 ; k<vertices ; k++)
             {
                adcenMatrix[j][k] =  adcenMatrix[j][k] | (adcenMatrix[j][i] & adcenMatrix[i][k]);  // r(k)[j , k] = r(k-1)[j , k] or (r(k-1)[j , i] and r(k-1)[i , k])
             }
        }
    }
    print(vertices, adcenMatrix);
}
public static void print(int vertices ,  int adcenMatrix[][]) {
    for(int i = 0 ; i <vertices ; i++)
    {
        for(int j = 0 ; j <vertices ; j++)
        {
            System.out.print(adcenMatrix[i][j] +"     "); // print the matrix
        }
        System.out.println();
    }
}
}

