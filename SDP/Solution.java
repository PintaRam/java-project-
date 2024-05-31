import java.util.Scanner;

class Solution {
    public static int compress(char[] chars) {
        int index = 0;  // Index for the position to set the compressed characters
        int i = 0;  // Index to traverse the chars array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the number of occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Set the character at the current index
            chars[index++] = currentChar;

            // If count is greater than 1, add the count to the chars array
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int len = compress(arr);
        System.out.println("Compressed length: " + len);
        
        // Print the compressed characters for verification
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
