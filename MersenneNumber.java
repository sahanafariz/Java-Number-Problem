package Number;
import java.util.Scanner;

public class MersenneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: Array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // Traverse the array to find and sum Mersenne numbers
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int n1 = 1; // Start from 2^1 - 1

            // Check if num is a Mersenne number
            while (true) {
                int mersenne = (int) Math.pow(2, n1) - 1;
                if (num == mersenne) {
                    sum += num;
                    break; // Exit the inner loop once a match is found
                }
                if (mersenne > num) {
                    break; // Exit the inner loop if Mersenne number exceeds num
                }
                n1++;
            }
        }

        // Output the sum of Mersenne numbers
        System.out.println(sum);

        sc.close();
    }
}
