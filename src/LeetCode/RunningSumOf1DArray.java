package LeetCode;

import java.util.Arrays;

public class RunningSumOf1DArray {
	public static void main(String[] args) {
	    RunningSumOf1DArray obj = new RunningSumOf1DArray();
	    
	    int[] input = {1, 2, 3, 4}; 
	    obj.runningSum(input);      
	}
	
public int[] runningSum(int[] nums) {
        
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; 
        }
        
        
        System.out.println(Arrays.toString(nums));
        
        return nums;
    }

}
