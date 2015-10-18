/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
*/

package projectEuler;

import java.util.ArrayList;

public class Problem3 {
	
	static long k = 600851475143L;
	
	 public boolean isPrime(long k)
	    {
	        if ( k % 2 == 0 ) //remove even number
	            return false;

	        long half = (k/2) % 2 == 0 ? (k/2)-1 : k/2; // Making sure to work with odd number only
	        // ? : operation meaning 
	        //max = (a > b) ? a : b;
	        // If (a>b) is true, return a, else, return b. 
	        for ( int i = 3; i < half; i += 2 ) //step of 2 to keep it odd numbers
	        {
	            if ( k % i == 0 )
	                return false;
	        }

	        return true;
	    }
	public static void main(String[] args) {
		
		Problem3 p = new Problem3();

	 
	    long num = 2;
	    while (1==1)
	    {
	        long prime = k / num;
	        // 
	        if ( k % prime == 0 &&  p.isPrime(prime) )
	        {
	            System.out.println(prime);
	            break;
	        }
	        num++;
	    }		
		
		
		
		

	}

}