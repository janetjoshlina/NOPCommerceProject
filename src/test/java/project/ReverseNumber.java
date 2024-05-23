package project;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 123456;
		int reminder = 0,quotient=0;
		while (number>0) {
			quotient = number%10;
			reminder = reminder*10 + quotient;
					number = number/10;
		}
		System.out.println(reminder);
	}

}
