package question3;

import java.util.LinkedHashMap;
import java.util.Map;

public class countOccurance {
	public static Map<String, Integer> count(String str) {
		int n = str.length();
		Map<String , Integer> m = new LinkedHashMap<String, Integer>();
		String temp = "";
		for(int i =0;i<n;i++) {
			if(str.charAt(i) == ' '  || i == n-1) {
				if(i == n-1) {
					temp += str.charAt(i);
				}
				if(m.containsKey(temp)) {
					int val  = m.get(temp);
					val++;
					m.put(temp, val);
					
				}
				else
					m.put(temp, 1);
				temp ="";
				continue;
			}
			temp += str.charAt(i);
		}
		return m;
	}
}
