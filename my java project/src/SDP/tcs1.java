/*Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

 

Display the most fit trainee (or trainees) and the highest average oxygen level.

 

Note:

 

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.

If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.

Average Oxygen Values should be rounded.

Example 1:

INPUT VALUES

95

92

95

92

90

92

90

92

90

 

OUTPUT VALUES

Trainee Number : 1

Trainee Number : 3

 

Note:

Input should be 9 integer values representing oxygen levels entered in order as

 

Round 1

 

Oxygen value of trainee 1

Oxygen value of trainee 2

Oxygen value of trainee 3

Round 2

 

Oxygen value of trainee 1

Oxygen value of trainee 2

Oxygen value of trainee 3

Round 3

 

Oxygen value of trainee 1

Oxygen value of trainee 2

Oxygen value of trainee 3

Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT” */


import java.util.Scanner;

public class tcs1 {
    public static char[] a;
    public static int calculate(int i)
    {
        
        int sum = i;
        for(int j = 0;j<3;j++)
        {
             sum = sum+3;
        }
        return sum/3;
           
    }
    public static void main(String[] args) {
       
        int arr[] = new int[9];
        for(int i = 0;i<9;i++)
        {    
            Scanner sc  = new Scanner(System.in);
            arr[i] = sc.nextInt();
            if(arr[i] <0 || arr[i] >100)
            {
                System.out.println("Invalid value shuld be between 0 and 100");
                arr[i] = sc.nextInt();
            }
        }
        int trainee[] = new int[3];
        for(int i = 0;i<3;i++)
        {
            trainee[i] = calculate(i);
        }
        if(trainee[0] == trainee[1])
        {
            System.out.println("train 1 and 2");

        }
        else if(trainee[0] == trainee[2])

        {
            System.out.println("tra 0  and 2");
        }
        else  if(trainee[1] == trainee[2])
        {
            System.out.println("train 1 and 2");
        }
        else if(trainee[0]>trainee[1] && trainee[0]>trainee[2])
        {
            System.out.println("traine 1");

        }else if(trainee[1]>trainee[2]&& trainee[1]<trainee[0])
        {
            System.out.println("traine 2");
            
        }
        else {
            System.out.println("traniee3");
        }

        
    }
}
