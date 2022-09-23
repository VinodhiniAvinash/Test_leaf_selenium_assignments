package Week3.Day2Ass;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		//create list to store the data
		
		List <Integer> values = new LinkedList<Integer>();
		
		//Add each data to list
		
		for(Integer eachdata : data) {
			values.add(eachdata);
		}
		
		//sort the list in ascending order
		
		Collections.sort(values);
		
		System.out.println("Values in ascending order " + values);
		
		//Identify the length and print the last second value
		
		int length = values.size();
		System.out.println("The last second value is " + values.get(length-2));
	}

}
