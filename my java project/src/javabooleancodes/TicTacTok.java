
//import java.net.Socket;
import java.util.*;
//import javax.swing.border.Border;

public class TicTacTok {
    static Scanner sc;
    static String turn;
    static String[][] board;

    public static String checkwinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0][0] + board[0][1] + board[0][2];
                    break;
                case 1:
                    line = board[1][0] + board[1][1] + board[1][2];
                    break;
                case 2:
                    line = board[2][0] + board[2][1] + board[2][2];
                    break;
                case 3:
                    line = board[0][0] + board[1][0] + board[2][0];
                    break;
                case 4:
                    line = board[0][1] + board[1][1] + board[2][1];
                    break;
                case 5:
                    line = board[0][2] + board[1][2] + board[2][2];
                    break;
                case 6:
                    line = board[0][2] + board[1][1] + board[2][0];
                    break;
                case 7:
                    line = board[0][0] + board[1][1] + board[2][2];
                    break;
            }
            // if x is the winner
            if (line.equals("XXX")) {
                return "X";
            }
            // for o is the winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        boolean flag = false;
        for (int a = 0; a < 9; a++) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].equals(String.valueOf(++a))) {
                        flag = true;
                        break;
                    } else if (flag == false && a == 8) {
                        return "draw";
                    }
                }
            }

        }

        System.out.println(turn + " s turn enter the slot ");
        return null;

    }

    public static void printboartd() {
        System.out.println("+---------+");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("+---------+");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("+---------+");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

    }

    public static void populateEmptyBoard() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = String.valueOf(++count);
            }
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        board = new String[3][3];
        turn = "X";
        String winner = null;
        populateEmptyBoard();
        System.out.println("Welcome to the two player to the tic tak toe");
        printboartd();
        System.out.println("X will play first select the slot");
        while (winner == null) {
            int numInput = sc.nextInt();
            int val1 = 0, val2 = 0;
            boolean flag = false;
            if (!(numInput > 0 && numInput <= 9)) {
                System.out.println("invalid slot  , enter the slot again");
                continue;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].equals(String.valueOf(numInput))) {
                        val1 = i;
                        val2 = j;
                        flag = true;
                    }
                }
            }

            if (flag == true) {
                board[val1][val2] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printboartd();
                winner = checkwinner();
            } else {
                System.out.println("slot already taken please re enter the slot :");
                continue;
            }
        }

        if (winner.equals("draw"))

        {
            System.out.println("IT IS DRAW ");

        } else {
            System.out.println("congrats " + winner + " has won");
        }
    }

}
