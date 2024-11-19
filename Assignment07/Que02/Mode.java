package question4;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mode {
	public static int modeOfArray(int arr[]) {
		if(arr == null)
			return 0;
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		for(int i =0 ;i<arr.length;i++) {
			if(m.containsKey(arr[i])){
				int data = m.get(arr[i]);
				data++;
				m.put(arr[i], data);
			}
			else {
				m.put(arr[i], 1);
			}
		}
		int max = Integer.MIN_VALUE;
		int ans = Integer.MIN_VALUE;
		for(Entry<Integer, Integer> ele : m.entrySet()) {
			if(ele.getValue() > max)
				ans = ele.getKey();
		}
		return ans;
	}
}
