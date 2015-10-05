package projectEuler;

public class Problem16 {

	public static void main(String[] args) {
		
	    double n = Math.pow(2, 100);
		
	    for(double i=1;i<n;i=i*10){
	    	
	    	
	    	
			System.out.println((n)/i+"   "+(n%i));

	    }
	    
	//	System.out.println(n);
			
	}

}