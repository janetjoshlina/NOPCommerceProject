package project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringManipulation {
	public static void main(String[] args) {
		String name = "Janet";
		char charAt = name.charAt(0);
		char[] charArray = name.toCharArray();
		System.out.println(charArray[1]);
		String valueOf = name.valueOf("Janet");
		System.out.println(valueOf);
		String[] split = name.split(" ", 1);
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		List<Integer> ls1 = new ArrayList<Integer>(ls);
		System.out.println(ls1);
	}
	
	

}
