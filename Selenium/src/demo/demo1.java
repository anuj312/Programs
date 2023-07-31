package demo;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class demo1 {
    public static void main(String[] args) {
    	
    	String str = "my name is anuj";
    	
    	String[] sp = str.split(" ");
    	
      
    	for(int i=sp.length-1;i>=0;i--) {
    		
    		//System.out.print(sp[i] +" ");
    		
    		for(int j=sp[i].length()-1;j>=0;j--) {
    			
    			System.out.print(sp[i].charAt(j));
    			
    		}
    		
    		System.out.print(" ");
    		
    		
    	}
    	
    	
    	
    	
    }
}


