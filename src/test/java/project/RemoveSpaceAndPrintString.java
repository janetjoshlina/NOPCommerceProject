package project;

public class RemoveSpaceAndPrintString {
	public static void main(String[] args) {
		String name ="Janet Joshlina";
		String reversename="";
		
		String[] namesplit = name.split(" ");
		for (int i = 0; i < namesplit.length; i++) {
			reversename = reversename + namesplit[i];
		}
		System.out.println(reversename);
	}

}
