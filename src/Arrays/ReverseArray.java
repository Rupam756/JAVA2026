package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		 n = sc.nextInt();
		int [] arr = new int[n];
		
		for(i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		
		for(i = 0; i<n; i++) {
			System.out.println(arr[i] + " ");
		reverse(arr);
		  System.out.println("\nReversed Array:");
	        for (i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
		}

	}
	
	static void reverse(int[] arr) {
		int start =0;
		int end = arr.length-1;
		
		while (start < end) {
		swap(arr, start, end);
		
		start++;
		end--;
	}
		
	}
	
	static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}

