package easyProblems;

public class NumberOfGoodPairs {
	
	public static int solution(int[] nums) {
		int sol=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					sol++;
					System.out.println(i +"---> "+ j);
				}
			}
		}
		return sol;
		
	}

}
 