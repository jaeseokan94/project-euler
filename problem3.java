package projectEuler;

import java.util.ArrayList;

public class Problem3 {
	
	static ArrayList<Long> a = new ArrayList<Long>();

	
	
	static ArrayList divide(long n){
		
		for(long i=2;i<n;i++)
			if(n%i==0&(primeCheck(i)==true)) {a.add(new Long(i));}
		
		return a;
	}
	
	static boolean primeCheck (long n){
		
		
		for(long i=2 ;i<n ;i++){
			if(n%i==0) return false;}
		
			
				return true;
		}
	
		
	
	public static void prime(long n){
		
		System.out.println(divide(n));
		
	}
		
		

	public static void main(String[] args) {
		
		prime(13195);
		
		for(long i=2;i<600851475143;i++){
			
		}
		
		
		

	}

}