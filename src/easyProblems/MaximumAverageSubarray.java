package easyProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumAverageSubarray {
	public static double solution(int[] nums, int k) {
		double maxAverage = 0;
		double sum;
		for (int i = 0; i <= nums.length - k; i++) {
			sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += nums[j];

			}
			if (sum > maxAverage) {
				maxAverage = sum;
			}

		}
		return maxAverage / k;
	}
	
	
	
}
