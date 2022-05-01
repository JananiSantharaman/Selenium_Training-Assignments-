package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFindSecondLargest {

	public static void main(String[] args) {
		//	int[] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		//sort the list
		Collections.sort(list);
		System.out.println("The largert number in the array is - "+list.get(list.size()-2));
	}

}
