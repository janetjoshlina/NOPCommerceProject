package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayReversal {
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		
		Set<Integer> sc = new TreeSet<Integer>();
		sc.addAll(ls);
		
		ls.clear();
		ls.addAll(sc);
		for (int i = ls.size()-1; i >=0; i--) {
			System.out.println(ls.get(i)+ " data");
		}
	}

}
