/*
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting
 * numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

package projectEuler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem14 {

	static ArrayList<Long> a = new ArrayList<Long>();

	
	static long collazt(long n){

	long counter = 0;
		
		while(n!=1){
			
			
		if((n%2)==0) {
		    n=n/2;
		}
		 else if((n%2)==1){
			   n=n*3+1;
		 }counter++;
		}
		
		return counter+1;
		
	}
	
	static Long counters(){
		
		for(int i=1;i<50;i++){
			
		int prev;
	
			
		a.add(collazt(i));
		}
		
		// return Collections.max(a);
		return a.get(12);
	  
	}
	
	


	public static void main(String[] args) {
	
		//System.out.println(collazt(113383));
		
System.out.println(counters());		
		
	}

}