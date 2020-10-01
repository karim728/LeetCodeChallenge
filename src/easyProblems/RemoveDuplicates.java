package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static int soltion(int[] nums) {
		Set<Integer> myset = new HashSet<>();
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			myset.add(nums[i]);
			
		}
		return myset.toArray().length;
	}
}
