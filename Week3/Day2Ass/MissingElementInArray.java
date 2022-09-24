package Week3.Day2Ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		List <Integer> values = new ArrayList<Integer>();
		
		//Add each data to list
		
		for(Integer eachdata : arr) {
			values.add(eachdata);
		}
		
		//sort the list in ascending order
		
		Collections.sort(values);
		
		System.out.println("Input array: " + values);		
		
		for(int i=1;i<=values.size();i++) {
			if(i!=values.get(i-1)) {							//iterate and identify the missing element
			System.out.println("The missing element " + i);
			break;
			}
		}

	}

}
