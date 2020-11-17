/*
 * Take as input S, a string. Write a function that replaces every odd character with the character having just higher 
 * ascii code and every even character with the character having just lower ascii code. Print the value returned.
 */
package easyProblems;

public  class StringOddEven {
	
	public static String solution (String s) {
		String result="";
		
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				int increase = (int)(s.charAt(i))+1;
				result+=(char)increase;
			}else {
				int decrease = (int)(s.charAt(i))-1;
				result+=(char)decrease;
			}
		}
		return result;
	}
}
