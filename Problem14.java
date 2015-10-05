package projectEuler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem14 {

	static ArrayList<Long> a = new ArrayList<Long>();

	
	static long collazt(long n){

	long counter = 0;
		
		while(n !=1){
			
			
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
		
		for(int i=100001;i<10000000;i++){
		
		a.add(collazt(i));
		}
		
		return Collections.max(a);
		
		
	}
	
	


	public static void main(String[] args) {
	
		//System.out.println(collazt(113383));
		
System.out.println(counters());		
		
	}

}