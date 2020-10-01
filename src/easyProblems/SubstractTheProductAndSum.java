package easyProblems;

public class SubstractTheProductAndSum {
	public static int solution(int n) {
		int divident =n;
		int rest=0;
		int product=1;
		int sum=0;
		while(divident>9) {
			rest=divident%10;
			divident=divident/10;
			product= product*rest;
			sum=sum+rest;
		}
		return (product*divident) - (sum+divident);
	}

}
