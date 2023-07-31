package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class findLargestNumberUsingOneLoop {
	
	
	public static void main(String[] args) {
		
		int[] randomIntegers = {22,34,65,78,12,56,78};
		
		Set<Long> dup = new HashSet<Long>();
		
		 for(int i: randomIntegers)
			{
				
				dup.add((long) i);
			}
		 
		List<Long> li = new ArrayList<Long>(dup);
		Collections.sort(li);
		System.out.println(li);
	    System.out.println("3rd largest number: "+ li.get(li.size()-3));
	    
	   
	  //  System.out.println(randomIntegers[randomIntegers.length-2]);
		
		
	}

}
