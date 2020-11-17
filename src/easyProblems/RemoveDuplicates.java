package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static int soltion(int[] nums) {
		int i=0;
		int j=1+1;
		for ( j=i+1 ; j < nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
			
		}
		return i+1;
	}
}
