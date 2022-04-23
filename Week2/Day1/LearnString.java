package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text0 = "TestLeaf";
		String text1 = "Testleaf";
		//to uppercase and lower case
		System.out.println(text0.toUpperCase());
		System.out.println(text0.toUpperCase());

		//compare the values with case sensitve and without case sensitve		
		boolean equals = text0.equals(text1);
		System.out.println(equals);
		boolean equalsIgnoreCase = text0.equalsIgnoreCase(text1);
		System.out.println(equalsIgnoreCase);

		//to verify if the sequence of string is avaialbe or not
		boolean contains =  text0.contains(text1);
		System.out.println(contains);

		// to verify if a string starts with given sequence
		boolean startwith = text0.startsWith("Test");
		System.out.println(startwith);
		boolean endwith =  text0.endsWith("af");
		System.out.println(endwith);

		//attach two strings we can also use + concatenation character
		String concat = text0.concat("   10$");
		System.out.println(concat);

		//trim the extra spaces
		System.out.println(text0.trim());

		//to get the character
		System.out.println(text0.charAt(0));

		//to get the length
		System.out.println(text0.length());
		for (int i =0;i<text0.length()-1;i++)
			System.out.println(text0.charAt(i));

		//to convert a string to array
		char[] arr1 = text0.toCharArray();
		System.out.println(arr1[0]);

		//to split the array
		String text = "Test Leaf is in chennai";
		String[] split = text.split(" ");
		for (int i =0;i<split.length;i++) {
			System.out.println(split[i]);
		}

		//to cut from a particular length
		String text2 = "TestLeaf";
		System.out.println(text2.substring(4));
		System.out.println(text2.substring(2,6));

		//TO REPLACE A VALUE regular expressions
		System.out.println(text2.replace("T","b"));

		//replace all and regular expression
		String text3 = "TestLeaf 1986";

		//to print other than numbers 
		System.out.println(text3.replaceAll("[^0-9]", ""));

		//to print numbers
		System.out.println(text3.replaceAll("[A-Za-z]", ""));

		
		
		
	}

}