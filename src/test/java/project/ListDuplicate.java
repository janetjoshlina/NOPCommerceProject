package project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDuplicate {
	
	private void test() {
		java.util.List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			ls.add(i);
		}
		System.out.println(ls.size());
		ls.add(2);
//		for (int i = 0; i < ls.size(); i++) {
//			for (int j = i+1; j < ls.size(); j++) {
//				if (ls.get(i).equals(ls.get(j))) {
//					System.out.println("the duplicate element is " + ls.get(i));
//				}
//			}
//			
//		}
		
		Set<Integer> sc = new HashSet<Integer>();
		
		
		for (Integer integer : ls) {
			if (!sc.add(integer)) {
				System.out.println("the duplicate element is " + integer);
			}
		}
		

	}
	
	public static void main(String[] args) {
		ListDuplicate ls = new ListDuplicate();
		ls.test();
		
	}

}
