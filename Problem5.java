/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without 
 * any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

package projectEuler;

public class Problem5 {

	public static void main(String[] args) {
		
		int n;
		n= 2520*2*11*13*17*19;
		/* 1, 2 , 3 , 2^2 , 5, 2*3, 2^3, 3^2, 2*5  (prime factorization of 1~10)
		 * 11 , (2^2)*3, 13, 2*7, 3*5, 2^4, 17 , 2*(3^2), 19, (2^2)*5 (prime factorzation of 11-20) 
		 * 
		 *  In order n to be divisble by all numbers 1 to 20, it needs to be common multiple. 
		 *  Since they are asking for leasat common multiple 
		 *  (2^4) * (3^2) * 5 * 7 * 11 * 13 * 17 * 19 is the least common multiple. 
		 */
		
	System.out.println(n);
    	
    	
   	  
	
	}
}
