package Arrays;
import java.util.*;

public class ResizingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr, newarr;
		int i , num , newnum;
		Scanner scn;
		
		scn = new Scanner(System.in);
		
		System.out.println("Enter the number of students : ");
		num = scn.nextInt();
		arr = new int[num];
		
		System.out.println("Enter marks for" + num+"students");
		for(i=0; i<arr.length;i++) {
			arr[i] = scn.nextInt();		
			}
		
		System.out.println("Enter additional number of students ");
		
		newnum = scn.nextInt();
		newarr = new int[num+ newnum];
		
		for(i=0; i<arr.length;i++)
			newarr[i] =arr[i];
		
		System.out.println("Enter marks for "+newnum+"new students");
		
		for(i=arr.length; i<newarr.length;i++)
			newarr[i] = scn.nextInt();
		
		System.out.println("The new Array now contains");
		for(i=0; i<newarr.length;i++)
			System.out.println(newarr[i]+ " ");
	}
	
	

}
