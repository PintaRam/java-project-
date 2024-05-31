package SDP;

import java.util.Scanner;

public class ratArea {
    public static int calculate(int r,int unit,int arr[])
    {
        if(arr.length == 0 )
            return -1;
        int total  = r*unit;
        int food  = 0;
        int house = 0 ;
        for(house)

    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
       
        int r =  sc.nextInt();
        int unit  =  sc.nextInt();
        int size =  sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i = 0 ;i<arr.length;i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println(calculate(r, unit , arr));

    }
    
}
