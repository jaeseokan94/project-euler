/*
 * Problem 16
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
*/


package projectEuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
	
    BigInteger a = new BigInteger("2").pow(1000);	
    BigInteger sum = BigInteger.valueOf(0);
    BigInteger add = BigInteger.valueOf(0);
    BigInteger div = BigInteger.valueOf(10);
    
    String num = String.valueOf(a);
    
    for(int i=0; i<num.length(); i++){
    	add=a.remainder(div);
    	sum=sum.add(add);
    	a=a.divide(div);
    }
  	System.out.println(sum);
	}
}

//Big Integer is two's-complement notation
//Why it is stored as two's-complement notation? 