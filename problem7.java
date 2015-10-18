package projectEuler;
import java.util.ArrayList;


public class Problem7 {

	

	static ArrayList<Long> a = new ArrayList<Long>();
	

	
	
	static Long divide(long n){
		
		for(long i=2;i<n;i++)
			if((primeCheck(i)==true)){a.add(new Long(i));}
		
		return a.get(10000);
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
		
		prime(120000);
		

	}

}
