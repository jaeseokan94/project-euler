package projectEuler;

/*
public class Problem10 {
	

	
	
	static long divide(long n){
		long sum=0;
		for(long i=3;i<n;i=i+2)
			if((primeCheck(i)==true)){
				sum+=i;
			}
		
		return sum+2;
	}
	
	
	
	static boolean primeCheck (long n){
		
		
		for(long i=3 ;i<n ;i=i+2){
			if(n%i==0) return false;}	
				return true;
		}
	
	public static void main(String[] args) {
		System.out.println(divide(200000));
		

	}

}*/
public class Problem10{
	   public static void main( String[] args ){
	      int i, number;
	      long sum = 2 + 3;
	      boolean itsAprime;	
	      
	      for (number = 5; number < 2000000; number += 2 ){
	         itsAprime = true;
	         for ( i = 3; i <= Math.sqrt(number); i += 2 )
	            if ( number % i == 0 ){
	               itsAprime = false;
	                  i = number;
	            }
	         if ( itsAprime == true )
	            sum += number; 
	      }	
	      System.out.println(sum);
	   }
	}
