package DAY3;

import java.util.Scanner; // Import for user input

public class FactorialIterative {
    public static void main(String[] args) {
        // 1. Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // 2. Prompt and read user input
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        // 3. Initialize result variable to 1
        long fact = 1; 
        
        // 4. Factorial logic (Iterative Loop)
        if (num < 0) {
            System.out.println("Error: Negative numbers don't have factorials.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i; // multiply fact by current number
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        
        sc.close(); // Close scanner to free resources
    }
}
