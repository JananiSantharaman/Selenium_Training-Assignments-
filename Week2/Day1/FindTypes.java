package week2.day1;


public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//intialize the variables		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		// Build the logic to find the count of each
		//	a) Convert the String to character array
		char[] arr1 = test.toCharArray();
		// Traverse through each character (using loop)
		//	c) Find if the given character is what type using (if)
		for(int i =0 ; i< arr1.length;i++ ) {
			if( Character.isLetter(arr1[i])) {
				letter = letter+1;
			}
			if (Character.isDigit(arr1[i])){
				num = num+1;
			}
			if (Character.isSpaceChar(arr1[i])){
				space = space+1;
			}
			if (!Character.isLetter(arr1[i]) && !Character.isDigit(arr1[i])&& !Character.isSpaceChar(arr1[i])){
				specialChar = specialChar +1;
			}
		}

		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
