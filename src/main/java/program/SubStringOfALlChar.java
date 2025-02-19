package program;

public class SubStringOfALlChar {

	public static void main(String[] args) {
		String s = "abaabaabx";
		String maxSubString="";
		int maxLength=Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1) == true) {
					if(maxSubString.length()<s1.length()) {
						maxSubString=s1;
						maxLength=s1.length();
					}
				}
			}
		}
		System.out.println(maxSubString +" "+maxLength);
		
	}

	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if (s.equals(sb.toString())) {
			return true;
		}
		return false;
	}
}
