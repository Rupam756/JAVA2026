package LinearSearch;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {

        int n, i;

        Scanner sc = new Scanner(System.in);

        // FIX 1: Read n before creating the array
        System.out.println("Enter the size of Array : ");
        n = sc.nextInt();

        // Now n has a value, so array can be created
        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int t = sc.nextInt();

        System.out.println("Enter the start index : ");
        int start = sc.nextInt();

        System.out.println("Enter the end index : ");
        int end = sc.nextInt();

        int ans = linear(arr, t, start, end);

        // Display result
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }

    static int linear(int[] arr, int t, int start, int end) {

        // FIX 2: Check if array is empty
        if (arr.length == 0) {
            return -1;
        }

        // FIX 3: Validate range to avoid ArrayIndexOutOfBoundsException
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid range!");
            return -1;
        }

        // FIX 4: Use <= end to include the end index in the search
        for (int i = start; i <= end; i++) {

            if (arr[i] == t) {
                return i; // Target found
            }
        }

        // Target not found
        return -1;
    }
}