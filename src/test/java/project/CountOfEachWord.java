package project;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWord {
	public static void main(String[] args) {
		String name = "Janet Joshlina Janet Janet";
		String[] splitwords = name.split(" ");
		int count =1;
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < splitwords.length; i++) {
			if (mp.containsKey(splitwords[i])) {
				mp.put(splitwords[i], count =count+1);
			}
			else
			{
				mp.put(splitwords[i], count);
		}
		
			
		}
		System.out.println(mp);
		
		
	}

}
