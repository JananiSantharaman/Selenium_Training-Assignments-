package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsFindIntersection {

	public static void main(String[] args) {
		//Declare An list for [3,2,11,4,6,7]
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		//Declare another list for {1,2,8,4,9,7};	
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		List<Integer> list3 = new ArrayList<Integer>();
		for (int i=0;i<=list1.size()-1;i++) {
			int value1 = list1.get(i);
			for (int j = 0;j<=list2.size()-1;j++) {
				int value2 = list2.get(j);		
				//if it is available then remove from the list
				if(value1==value2) {
					System.out.println(value2);
					list3.add(value2);
				}
			}
			System.out.println("the intesected values are"+ list3);

		}
	}
}