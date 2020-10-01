package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static int solution(String J, String S) {
		Set<Character> myset = new HashSet<>();
		int count = 0;

		for (int i = 0; i < J.length(); i++) {
			myset.add(J.charAt(i));
			System.out.println(myset);
		}

		for (int i = 0; i < S.length(); i++) {
			if (myset.contains(S.charAt(i))) {
				System.out.println(S.charAt(i));
				count++;
			}
		}
		return count;
	}

}
