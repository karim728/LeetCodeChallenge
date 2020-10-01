package easyProblems;

public class DefrangingAnIpAddress {

	public static String solution(String address) {
		StringBuilder  def = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if(address.charAt(i)=='.') {
				def.append("[.]");
			}else
			def.append(address.charAt(i));
		}
		return def.toString();
	}

}
