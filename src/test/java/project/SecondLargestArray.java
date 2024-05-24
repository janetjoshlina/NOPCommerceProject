package project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestArray {
	public static void main(String[] args) {
		
		Set<Integer> sc = new TreeSet<Integer>();
		for (int i = 0; i < 5; i++) {
			sc.add(i);
			sc.add(5);
			}
		List<Integer> ls = new ArrayList<Integer>();
		ls.addAll(sc);
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.addAll(sc);
		
		boolean sc1 = ls.containsAll(ls1);
		System.out.println(ls);
		System.out.println(ls1);
		System.out.println(sc1);
		
		int[] add = {1};
		//add[1]=1;
		List<Integer> arrayList = new ArrayList<Integer>();
		for (Integer integer : add) {
			arrayList.add(integer);
		}
		System.out.println(arrayList);
		System.out.println("the second largest array is " + ls.get(ls.size()-2));
	}
	
	

}
