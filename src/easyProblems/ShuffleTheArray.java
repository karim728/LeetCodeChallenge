package easyProblems;
/*
 	Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
	Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

public class ShuffleTheArray {
	
	public static int[] solution(int[] nums, int n) {

		int length= nums.length;
		
		int i=0;
		int  k=n;
		int index=0;
		
		int[] sol= new int[length];
		while(index<length) {
			sol[index++]=nums[i++];
			sol[index++]=nums[k++];
			
			
		}

		
		return sol;
	}

}
