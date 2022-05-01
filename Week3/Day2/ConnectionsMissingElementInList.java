package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectionsMissingElementInList {
	public static void main(String[] args) {
		// Here is the input {1,2,3,4,7,6,8}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		//sort the list
		Collections.sort(list);
		// loop through the array (start i from arr[0] till the length of the array)
		int length = list.size();
		for (int i = 0; i < length - 1; i++) {
			// check if the iterator variable is not equal to the array values respectively
			if (i + 1 != list.get(i)) {
				// print the number
				System.out.println("The Missing element in array is - " + (i + 1));
				// once printed break the iteration
				break;
			}
		}
	}
}
