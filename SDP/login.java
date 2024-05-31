import java.util.Scanner;
// // INPUT VALUES
// 95
// 92
// 95
// 92
// 90
// 92
// 90
// 92
// 90

// OUTPUT VALUES
// Trainee Number : 1
// Trainee Number : 3
public class login{
    public static final int NUM_TRAINEES = 3;
    public static final int NUM_ROUNDS = 3;

    // Function to check if the oxygen value is within the valid range
    public static boolean isValidOxygenValue(int oxygen) {
        return (oxygen >= 1 && oxygen <= 100);
    }

    public static void main(String[] args) {
        int[][] oxygenLevels = new int[NUM_TRAINEES][NUM_ROUNDS];
        int[] averageOxygen = new int[NUM_TRAINEES];
        int maxAverage = 0;
        boolean unfit = true;

        Scanner scanner = new Scanner(System.in);

        // Input oxygen levels for each trainee and round
        System.out.println("Enter oxygen levels for each trainee for each round:");
        for (int round = 0; round < NUM_ROUNDS; round++) {
            for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
                int oxygen;
                do {
                    oxygen = scanner.nextInt();
                    if (!isValidOxygenValue(oxygen)) {
                        System.out.println("Invalid input! Oxygen value should be between 1 and 100.");
                    }
                } while (!isValidOxygenValue(oxygen));
                oxygenLevels[trainee][round] = oxygen;
            }
        }

        // Calculate average oxygen levels for each trainee
        for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
            for (int round = 0; round < NUM_ROUNDS; round++) {
                averageOxygen[trainee] += oxygenLevels[trainee][round];
            }
            averageOxygen[trainee] /= NUM_ROUNDS;
            if (averageOxygen[trainee] >= 70) {
                unfit = false;
                if (averageOxygen[trainee] > maxAverage) {
                    maxAverage = averageOxygen[trainee];
                }
            }
        }

        // Output the most fit trainees
        System.out.println("OUTPUT VALUES");
        if (unfit) {
            System.out.println("All trainees are unfit.");
        } else {
           
            for (int trainee = 0; trainee < NUM_TRAINEES; trainee++) {
                if (averageOxygen[trainee] == maxAverage) {
                    System.out.print("Trainee Number : ");
                    System.out.print((trainee + 1) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
