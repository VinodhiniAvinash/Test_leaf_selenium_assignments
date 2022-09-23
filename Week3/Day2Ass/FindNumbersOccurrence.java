package Week3.Day2Ass;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurrence {

	public static void main(String[] args) {
		
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//Create TreeMap to store integer array in ascending order
		
		Map<Integer,Integer> numbers = new TreeMap<Integer,Integer>();
		
		//For loop to add each number to map
		
		for(Integer eachnum : input) {
			if(numbers.containsKey(eachnum)) {
				numbers.put(eachnum,numbers.get(eachnum)+1); 		// If number is already exist, update with +1
			}
			else
			{
				numbers.put(eachnum,1);								// If number does not exist, add as new entry
			}
				
		}
		
		System.out.println(numbers);
		

	}

}
