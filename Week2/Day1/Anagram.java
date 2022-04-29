package week2.day1;
import java.util.Arrays;
public class Anagram {
	public static void main (String[] args) {
		//Declare a String 
		String text1 = "stops";		
		//Declare another String
		String text2 = "potss"; 
		// a) Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length()) {	
			//b) Convert both Strings in to characters and sort them
			char[] arr1 = text1.toCharArray();
			Arrays.sort(arr1);
			char[] arr2 = text2.toCharArray();
			Arrays.sort(arr2);		
			// d) Check both the arrays has same value
			for (int i = 0; i < arr1.length; i++) {
				//System.out.println("Array1 "+arr1[i]);
				//System.out.println("Array2 "+arr2[i]);
				// e) Compare Both the arrays using a condition statement
				if (arr1[i] == arr2[i]) {
					// f) Print the first array (shoud match item in both arrays)
					System.out.println(arr1[i]);
				}
					else {
						System.out.println("Doesnt match");	
						break;
					
				}
			}
		}
	}
}
