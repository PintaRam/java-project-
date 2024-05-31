import java.util.*;

interface Arithmetic {
    int operation(int a, int b);
}

public class GFG {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter 2 operands:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        // Addition using Lambda expression
        Arithmetic addition = (int a, int b) -> (a + b);
        // Arithmetic addition = (int a, int b) -> {return a + b;};
        System.out.println("Addition = " + addition.operation(x, y));
    }
}
