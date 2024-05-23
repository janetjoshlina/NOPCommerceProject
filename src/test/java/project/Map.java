package project;

import java.util.HashMap;
import java.util.TreeMap;
public class Map {
	
	public static void main(String[] args) {
		String name= "JanetJoshlina";
		char[] na = name.toCharArray();
		java.util.Map<Character,Integer> mp = new HashMap<Character,Integer>();
		for (int i = 0; i < na.length; i++) {
			if (mp.containsKey(na[i])) {
				mp.put(na[i] ,mp.get(na[i]+1));
			}
			else
			{
				mp.put(na[i],1);
			}
		}
		System.out.println(mp);
	}

}
