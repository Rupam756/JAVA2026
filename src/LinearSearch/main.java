package LinearSearch;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.println("Enter the target:");
        int t = sc.nextInt();

        // Call linear search
        int ans = linear(arr, t);

        // Display result
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }

    // Linear Search Method
    static int linear(int[] arr, int t) {

        // Check if array is empty
        if (arr.length == 0) {
            return -1;
        }

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // If target is found, return index
            if (arr[i] == t) {
                return i;
            }
        }

        // Target not found
        return -1;
    }
}