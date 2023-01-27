import java.util.Scanner;

public class FormLetterWriter {

	static Scanner c = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		
		String dS1 = displaySalutations("Cruz");
		String dS2 = displaySalutations("Felipe", "Cruz");
		
		System.out.println(dS1);
		System.out.println(dS2);
		
		System.out.println("\nThank you for your recent order");
		
	}

	static String displaySalutations(String lname) {
		
		return "Dear Mr. or Ms. " + lname;
	}
	
	static String displaySalutations(String fname, String lname) {
		
		return "Dear "+ fname + " " + lname;
	}
}
