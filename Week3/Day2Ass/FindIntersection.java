package Week3.Day2Ass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		int[] input1 = {3,2,11,4,6,7};
		int[] input2 = {1,2,8,4,9,7};
		
		System.out.print("The intersection numbers are ");
		
		//create ArrayList
		
		List <Integer> values = new ArrayList<Integer>();
		
		// Adding input1 to ArrayList
		for(Integer eachdata : input1)
		{
			values.add(eachdata);
		}
		
		//Adding input2 to ArrayList
		
		for(Integer eachdata : input2)
		{
			values.add(eachdata);
		}
		
		//create two set to store unique and duplicate values
		
		Set <Integer> uniquevalues = new HashSet<Integer>();		
		Set <Integer> duplicatevalues = new HashSet<Integer>();
		
		for(Integer dupitem : values)
		{
			if(!uniquevalues.add(dupitem))               // identify duplicate values and store unique values
			{
				duplicatevalues.add(dupitem);			// store duplicates values
			}
		}
		
		System.out.println(duplicatevalues);

	}

}
