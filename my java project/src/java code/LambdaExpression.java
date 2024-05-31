import java.util.Scanner;

interface Arithmetic {
    int operation(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the two operands : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        Arithmetic addition = (int a, int b) -> (a + b);
        System.out.println("Addition : " + addition.operation(x, y));
        Arithmetic subtratcion = (int a, int b) -> (a - b);
        System.out.println("subtraction : " + subtratcion.operation(x, y));
        Arithmetic multiplication = (int a, int b) -> (a * b);
        System.out.println("multiplication  : " + multiplication.operation(x, y));
        Arithmetic division = (int a, int b) -> (a / b);
        System.out.println("Division:  " + division.operation(x, y));

    }

}
