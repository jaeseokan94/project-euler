package projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

//Problem 16
//215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//What is the sum of the digits of the number 21000?

public class Problem16 {

	public static void main(String[] args) {
	
    BigInteger a = new BigInteger("2").pow(1000);	
    a.toByteArray();
    
   
    for(int i=0; i<a.bitLength(); i++){
        	System.out.println(a.toString().charAt(i));
        }
    
			
	}

}