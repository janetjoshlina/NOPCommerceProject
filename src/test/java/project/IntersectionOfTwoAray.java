package project;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoAray {
	public static void main(String[] args) {
		Set<Integer> sc = new HashSet<Integer>();
		Set<Integer> sc1 = new HashSet<Integer>();

		sc.add(1);
		sc.add(2);
		sc.add(5);
		sc1.add(1);
		sc1.add(10);
		sc1.add(30);
		sc1.add(5);
		sc1.add(5);

//		for (Integer integer : sc1) {
//			if (!sc.add(integer)) {
//				System.out.println("Intersecting element is " + integer);
//			}
//
//		}
		
		//sc.retainAll(sc1);
		sc.removeAll(sc1);
		System.out.println(sc);
	}

}
