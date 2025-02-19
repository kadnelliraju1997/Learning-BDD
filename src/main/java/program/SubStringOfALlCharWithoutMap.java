package program;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SubStringOfALlCharWithoutMap {

	public static void main(String[] args) {
		String s = "abaabaabx";
		LinkedHashMap<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrome(s1) == true) {
					if (!m.containsKey(s1)) {
						m.put(s1, 1);
					} else {
						m.put(s1, m.getOrDefault(s1, 0) + 1);
					}
				}
			}
		}
		System.out.println(m.keySet());
		String key = "";
		int val = 0;
		for (Entry<String, Integer> entry : m.entrySet()) {
			if (key.length() < entry.getKey().length())
				key = entry.getKey();
			val = entry.getValue();
		}
		System.out.println(key + " " + key.length());
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
