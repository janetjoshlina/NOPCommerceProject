package project;

import java.util.HashMap;

public class NumberOfDuplicates {
	public static void main(String[] args) {
		String name = "Janet Joshlina";
		int count =1;
		java.util.Map<Character,Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if(mp.containsKey(name.charAt(i)))
			{
				mp.put(name.charAt(i), count +1);
			}
			else
			{
				mp.put(name.charAt(i), count);
			}
		}
		System.out.println(mp);
	}

}
