package week1.day1;

//import javax.sound.midi.SysexMessage;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an integer Input and assign a value 13
		int checkprimeval = 7;
		// Declare a boolean variable flag as false
		boolean setflag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i < checkprimeval / 2; i++) {
			// Divide the input with each for loop variable and check the remainder
			int remainderval = checkprimeval / i;
			// Set the flag as true when there is no remainder
			if (remainderval != 0) {
				setflag = true;
			}
			// break the iterator
		}
		// Check the flag (Provide a condition)
		if (setflag) {
			// Print 'Prime' when the condition matches
			System.out.println("Prime number");
		} else {
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println("Not a Prime number");
		}

	}

}
