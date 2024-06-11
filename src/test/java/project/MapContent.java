package project;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapContent {
	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < 10; i++) {
			mp.put("data"+i, i);
		}
		Set<String> keySet = mp.keySet();
		System.out.println(keySet);
		for (String string : keySet) {
			System.out.println(string);
		}
		Collection<Integer> values = mp.values();
		System.out.println(values);
		
		mp.remove("data1");
		mp.remove("data2",3);
		
		mp.replace("data2", 23);
		mp.replace("data2", 23, 24);
		Set<Entry<String, Integer>> entrySet = mp.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(mp);
		System.out.println(mp);
		System.out.println(synchronizedMap);
	}

}
