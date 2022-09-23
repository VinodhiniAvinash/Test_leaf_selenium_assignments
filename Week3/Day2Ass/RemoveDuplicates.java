package Week3.Day2Ass;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Input String
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Split the string to array
		
		String[] split = text.split(" ");
		
		//Inserting values into LinkedHashSet
		//Duplicate values will not be stored in LinkedHashSet
				
		Set<String> remdup = new LinkedHashSet <String> ();
		
		for(String eachItem : split) {
			remdup.add(eachItem);
	}
			
		//Convert the array back to string using "join" and print
			System.out.println(String.join(" ",remdup));

}
}
