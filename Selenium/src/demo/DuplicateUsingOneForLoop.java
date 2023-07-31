package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateUsingOneForLoop {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Anuj","Anuj","Rana","kumar");
		
		Set<String> st = new HashSet<String>(str);		
		
		
		for(String a: st) {
			
			if(st.contains(a)) {
				
				System.out.println(a);
			}
			else {
				
				st.add(a);
				
			}
			
			//System.out.println(a);
		}
		
		
}
}
