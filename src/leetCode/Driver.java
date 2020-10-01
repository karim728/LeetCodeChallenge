package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import easyProblems.DefrangingAnIpAddress;
import easyProblems.NumberOfGoodPairs;
import easyProblems.RemoveDuplicates;
import easyProblems.RunningSum;
import easyProblems.ShuffleTheArray;
import easyProblems.SubstractTheProductAndSum;

public class Driver {
	static int[] array ={1,2,3,1,1,3};
	static String myaddress="1.1.2.1";
	static RunningSum runningSum;
	static ShuffleTheArray shuffle;
	static NumberOfGoodPairs numberofgoodpairs;
	static DefrangingAnIpAddress address;
	static SubstractTheProductAndSum substractproduct;
	static RemoveDuplicates removeduplicates;
	public static void main(String[] args) {
		
//		System.out.println(Arrays.toString(runningSum.solution_two(array)));
//		System.out.println(Arrays.toString(shuffle.solution(array,2)));
//		System.out.println(numberofgoodpairs.solution(array));
//		System.out.println(address.solution(myaddress));
//		System.out.println(substractproduct.solution(10225));
		System.out.println(removeduplicates.soltion(array));
		
		Map<String,Integer> s = new HashMap<>();
		s.put("a", 1);
		s.put("w", 4);
		s.put("c", 2);
		
		System.out.println(s);
	}

}
