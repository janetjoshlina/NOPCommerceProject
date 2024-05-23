package project;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachCharacter {
	public static void main(String[] args) {
		String name ="janet Joshlina";
		char[] eachCharacter= name.toCharArray();
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < eachCharacter.length; i++) {
			if (mp.containsKey(eachCharacter[i])) {
				int count = mp.get(eachCharacter[i]);
				mp.put(eachCharacter[i], count+1);
			}
			else
			{
				mp.put(eachCharacter[i], 1);
			}
		}
		System.out.println(mp);
		System.out.println("adding new line of code");
		System.out.println("adding one more line");
	}

}
