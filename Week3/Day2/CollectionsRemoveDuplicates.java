package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsRemoveDuplicates {

	public static void main(String[] args) {
		//create a new list and add the values
		List<String> list = new ArrayList<String>();
		List<String> list1= new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("G");
		list.add("F");
		list.add("C");
		//Initialize  loop to check whether the word is there in the array
		for (int i=0;i<=list.size()-1;i++) {
			String value1 = list.get(i);
			for (int j = i+1;j<=list.size()-1;j++) {
				String value2 = list.get(j);		
				//if it is available then remove from the list
				if(value1==value2) {
					list.remove(value1);
					list1.add(value2);
				}
			}
		}
		System.out.println("The list without duplicates " +list);
		System.out.println("The removed duplicates are " +list1);

	}
}
