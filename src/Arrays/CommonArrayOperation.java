package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class CommonArrayOperation {

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
		}
		System.out.println("Original Array is :");
		
		for(i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		Arrays.sort(arr);
System.out.println("\nSorted Array is :");
		
		for(i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		}
		
		int index = Arrays.binarySearch(arr, 65);
		System.out.println("\nElements 65 found atr "+index);
		
		Arrays.fill(arr, 0);
System.out.println("\nCleard ARRAy :");
		
		for(i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		

	}

}
