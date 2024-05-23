package project;

public class ReverseofStringWords {
	public static void main(String[] args) {
		String name ="Janet Joshlina";
		String reversename="";
		
		String[] reverseword = name.split(" ");
		
		for (int i = reverseword.length-1; i >=0; i--) {
			reversename = reversename + reverseword[i] + " ";
		}
		System.out.println(reversename);
	}

}
