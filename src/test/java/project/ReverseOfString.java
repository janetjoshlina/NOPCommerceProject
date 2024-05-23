package project;

import java.util.Iterator;

public class ReverseOfString {
	public static void main(String[] args) {
		String name = "Janet";
		String reverseString="";
		for (int i = name.length()-1; i >=0 ; i--) {
			reverseString = reverseString+name.charAt(i);
		}
		System.out.println(name);
		System.out.println(reverseString);
	}

}
