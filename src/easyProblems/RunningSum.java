package easyProblems;
/*
  	Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
	Return the running sum of nums.
	Example:
	Input: nums = [1,2,3,4]
	Output: [1,3,6,10]
	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */

public class RunningSum {
	
	public static int[] solution(int[] nums) {
		int sum[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0) {
					sum[i] = nums[i];
				} else {
					sum[i] += nums[j];
				}
			}

		}
		return sum;
	}
	
	public static int[] solution_two(int[] nums) {
		int sum[] = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(i==0) {
				sum[i]=nums[i];
			}else {
				sum[i]=nums[i]+sum[i-1];
			}
		}
		return sum;
	}

}
