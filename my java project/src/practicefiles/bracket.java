import java.util.*;

public class bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a String with a parenthesis [] ,{} ,or () : ");
        String str = sc.nextLine();
        if (str.isEmpty())
            System.out.println("empty String ");
        else
            System.out.println(checkBalance(str));
        sc.close();
    }

    public static String checkBalance(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if ((ch == ')' || ch == '}' || ch == ']') && (!stack.isEmpty())) {
                if (((char) stack.peek() == '(') && (ch == ')') || ((char) stack.peek() == '{') && (ch == '}')
                        || ((char) stack.peek() == '[') && (ch == ']')) {
                    stack.pop();

                } else {
                    return "not balanced";
                }

            } else if (ch == ')' || ch == '}' || ch == ')')
                return "net balanced";

        }

        if (stack.isEmpty())
            return "balanced";
        else
            return "not balanced";
    }
}
