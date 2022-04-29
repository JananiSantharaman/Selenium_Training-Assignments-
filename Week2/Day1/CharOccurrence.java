package week2.day1;
public class CharOccurrence {

	public static void main(String[] args) {
		//srting "testttleaf" 
		//print the numer of e in the string
		String test0 = "testttleaf";
		//System.out.println(test0.length());
		int outputval = 0;
		int compareval = 't';
		for (int i =0;i<test0.length();i++) {	
			char  value1 = test0.charAt(i);
			if ( value1==compareval) {
				outputval =outputval +1 ;
			}
		}
		//Compare if the char is present in the given string
		if(outputval!=0) {
			System.out.println("The number of occurence of the charecter is = "+ outputval);
		}
		else {
			System.out.println("The Character is not found in the given string");
		}
	}

}
