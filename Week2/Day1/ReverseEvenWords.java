package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare the input
		String test = "I am a software tester in xxx company"; 
		//Split the words and have it an array
		String[] split = test.split(" ");
		//b) Traverse through each word (using loop)
		for (int i =0;i<split.length;i++) {
			//c) find the odd index within the loop (use mod operator)
			String reverseval = "";
			if(i%2!=0) {
				//split the words and have it in an array
				char[] arr1 = split[i].toCharArray();
				for (int j = arr1.length-1;j>=0;j--) {
					//reverseval1 = reverseval1 + arr1[j];	
					reverseval= reverseval+ arr1[j];
				}							
				//e)print the even position words in reverse order using another loop (nested loop)
				System.out.print(reverseval+" ");					
			}
			//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			else {
				System.out.print(split[i]+" ");	
			}

		}
	}
}