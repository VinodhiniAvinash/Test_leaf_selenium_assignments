package Week3.Day2Ass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicate {

	public static void main(String[] args) {
		
		String str ="abbaba";
		
		//Create HashMap to store the values
		Map<Character,Integer> dupstring = new LinkedHashMap<Character,Integer>();
		
		//Convert the string to charArray
		
		char[] charArray = str.toCharArray();
		
		//Add each character to the Map
		
		for (char ch : charArray) {
			dupstring.put(ch,dupstring.getOrDefault(ch,0)+1);
		}
		
		//Conver to entryset
		
		Set<Entry<Character,Integer>> entrySet = dupstring.entrySet();
		
		int maxOccurrence = 0;
		char maxCharacter = 0;
		
		//create list to store the most duplicated character
		
		List<String>maxChar = new ArrayList<String>();
		String str1 =" ";
		
		//for loop to iterate through each character and identify the most duplicated character.
		for(Entry<Character,Integer > eachEntry : entrySet) {
			
			if(eachEntry.getValue() >= maxOccurrence) {
			
			maxCharacter=eachEntry.getKey();
			maxOccurrence=eachEntry.getValue();
			maxChar.add(str1);
			}
		}
		
		System.out.println(maxCharacter);
		
	}

}
