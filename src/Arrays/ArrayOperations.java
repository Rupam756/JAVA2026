package Arrays;
import java.util.*;
public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23,45,65,89,32};
		int i;
		
		//print original array
		System.out.println("Original Array");
		for(i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		// sort array
		Arrays.sort(arr);
		System.out.println("\nSorted array");
		for(i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		
		//
		
		
		

	}

}
