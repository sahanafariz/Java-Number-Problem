package Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeprateAl {
    public static void main(String[] args) {
        // Example input string
        String input = "a1b2c3d4e5f6";
        
        // Variables to hold alphabets and numbers
        StringBuilder letters = new StringBuilder();
        StringBuilder numberBuilder = new StringBuilder();
        int sum = 0;

        // Extract alphabets and numbers from the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numberBuilder.append(ch);
            } else {
                // Handle non-alphanumeric characters if needed
            }
        }

        // Add the numbers together
        if (numberBuilder.length() > 0) {
            sum += Integer.parseInt(numberBuilder.toString());
        }

        // Sort the alphabets
        char[] lettersArray = letters.toString().toCharArray();
        Arrays.sort(lettersArray);

        // Print the results
        System.out.println("Sorted Alphabets: " + new String(lettersArray));
        System.out.println("Sum of Numbers: " + sum);
    }
}
