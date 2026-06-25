package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AgnosticBiarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        int target;
        System.out.println("Enter the target element : ");
        target = sc.nextInt();
		int ans = binarySearch(arr, target);
        System.out.println("Your target is " + ans);


	}
	
static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start] > arr[end];
		
		while(start <= end) {
			int mid = start + (end-start)/2;

			if(arr[mid] == target) {
				return mid;
			}
			
			
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				}
				else {
					start = mid+1;
				}
			}else {
				if (target > arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}
			
		}
		return -1;
		
		
	}

}
