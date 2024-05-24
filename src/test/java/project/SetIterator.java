package project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
	public static void main(String[] args) {
		Set<Integer> sc = new HashSet<Integer>();
		sc.add(1);
		sc.add(2);
		Iterator<Integer> iterator = sc.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
