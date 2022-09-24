package Week3.Day2Ass;

import java.util.Map;
import java.util.TreeMap;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//Create TreeMap to store integer array in ascending order
		
		Map<Integer,Integer> numbers = new TreeMap<Integer,Integer>();
		
		//For loop to add each number to map
				
		for(Integer eachnum : arr) {
		if(numbers.containsKey(eachnum)) {					//identify the duplicate the value
		numbers.put(eachnum,numbers.get(eachnum)+1);		//Add the duplicate value to the TreeMap and increase the count
		System.out.println(eachnum);						//print the duplicate value
		}
		else
		{
			numbers.put(eachnum,1);								// If number does not exist, add as new entry
		}
	}
	}
}
