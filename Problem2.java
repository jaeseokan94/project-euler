package projectEuler;

import java.math.BigInteger;


public class Problem2{
	
	
	public static void main(String args[]){
		long sum = 0;
		long x = 0;
		long y = 1;
		long z = x+y;
		
		
		while(z<4000000){
			if(z%2==0){
				sum = sum+z;
			}
			
			x=y;
			y=z;
			z = x+y;
			
		} System.out.println(sum);
		
		
	}
	

}

/*
public class Problem2 {
	
	public static long fibArray[]=new long[20000];	
	public static long fibonacci1(long n){
	    long fibValue=0;
	         if(n==0){
	         return 0;
	         }else if(n==1){
	        	 return 1;
	        	 }else if(fibArray[(int)n]!=0){
	        		 return fibArray[(int)n];
	        		 }
	        	 else{
	        		 fibValue=fibonacci1(n-1)+fibonacci1(n-2);
	        		 fibArray[(int) n]=fibValue;
	        		 return fibValue;
	        		 }      	         
	         }
	
	
	
	public static void answer(){
		long sum=0;
		for(int i=1;i<43;i++){
			if(fibonacci1(i)%2==0)
				sum+=fibonacci1(i);
		}
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibArray[0]=1;
		fibArray[1]=1;
		
		
		answer();

		
	}

}*/
/*
public class Problem2 {
	public static long fibArray[] = new long[200];
	static {
		fibArray[0] = 1;
		fibArray[1] = 2;
	}

	public static long fibonacci1(int n) {
		if (fibArray[n] == 0) {
			fibArray[n] = fibonacci1(n - 1) + fibonacci1(n - 2);
			if (fibArray[n] < 0) {
				System.err.println("Computed fibonacci number below zero at index " + n);
			}
		}
		return fibArray[n];
	}

	public static void answer() {
		long sum = 0;
		
		for (int i = 1; i < 100; i++) {
			if (fibonacci1(i) % 2 == 0) {
				sum = sum+ fibonacci1(i);
			}
			else{
				sum += 0;
			}
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		answer();
	}
}
*/
/*
BigInteger first = new BigInteger("0");
BigInteger second = new BigInteger("1");
BigInteger temp;// = new BigInteger("0");
int counter = 1;

 while(numberOfDigits(second) < 1000)
 {
     temp = new BigInteger(second.toString());
     second = second.add(first);
     first = new BigInteger(temp.toString());
     counter++;
 }
 System.out.print(counter);


}

public static int numberOfDigits(BigInteger number)
{
  return number.toString().length();
}*/