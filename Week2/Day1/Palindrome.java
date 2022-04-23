package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
		String  Value = "mame";
		// b) Declare another String rev value as ""
		String  rev = "";
		//Iterate over the String in reverse order
		// Add the char into rev
		if (Value.length()!=0 && Value.length()!=2) {
			for (int i = Value.length()-1;i>=0;i--) {
				rev = rev +Value.charAt(i);		
				//Compare the original String with the reversed String, if it is same then print palinDrome 
			}
			if (rev.equalsIgnoreCase(Value)) {
				System.out.println("The given string is a palindrome");
			}
			else {
				System.out.println("The given string is not a palindrome");
			}
		}
		else {
			System.out.println("Please provide a valid input");
		}
	}
}
