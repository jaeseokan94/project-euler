/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
*/

package projectEuler;

import java.util.ArrayList;

public class Problem3 {
	
	static long k = 100;
		//	600851475143L;
	
	 public boolean isPrime(long n)
	    {
	        if ( n % 2 == 0 ) //even numer so can't be prime
	            return false;

	        long half = (n/2) % 2 == 0 ? (n/2)-1 : n/2; //make sure we work with odd number
	        for ( int i = 3; i < half; i += 2 ) //step of 2 to keep it odd numbers
	        {
	            if ( n % i == 0 )
	                return false;
	        }

	        return true;
	    }
	public static void main(String[] args) {
		
		Problem3 p = new Problem3();

	    long t = 600851475143L;
	    long d = 2;
	    while (1==1)
	    {
	        long tmp = 600851475143L / d;
	        if ( t % tmp == 0 &&  p.isPrime(tmp) )
	        {
	            System.out.println("= " + tmp);
	            break;
	        }
	        d++;
	    }		
		
		
		
		

	}

}

/*	for(long i=2 ;i<n ;i++){
if(n%i!=0) return true;}

return false;*/