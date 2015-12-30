/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */

package projectEuler;

import java.math.BigInteger;

public class Problem15 {
	
	static BigInteger binomial(final int N, final int K) {
	    BigInteger ret = BigInteger.ONE;
	    for (int k = 0; k < K; k++) {
	        ret = ret.multiply(BigInteger.valueOf(N-k))
	                 .divide(BigInteger.valueOf(k+1));
	    }
	    return ret;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=20;
		long a=x+x;
		long b=x;
		
		long sumA=1;
		long sumB=1;
		
		for(long i= 21; i<=33 ; i++ ){
			sumA = sumA*i;
			
		}
		
		for(long j = 1; j<=b ; j++){
			sumB= sumB*j ;
		}
		
		System.out.println(binomial(40,20));

		System.out.println(sumA/sumB);
		System.out.println(sumA);
		System.out.println(sumB);

	}

}
