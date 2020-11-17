 // Find the first non-repeated char in a given String;
  // input: aabbcaad;
  // output: c

package easyProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeat {
	
	public static char firstNonRepeated(String a){
		Map<Character,Integer> map= new LinkedHashMap<>();
		for(int i=0; i<a.length();i++) {
			char next= a.charAt(i);
			if(map.containsKey(next)) {
				map.put(next, map.get(next)+1);
			}else {
				map.put(next, 1);
			}
		}
		
		char nonrepeat=' ';
		
		
		
		for( char c : map.keySet()) {
			if(map.get(c)==1) {
				System.out.println(c);
				nonrepeat=c;
				break;
			}
		}
		
		return nonrepeat;
	}
	

}
