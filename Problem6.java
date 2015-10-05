package projectEuler;

public class Problem6 {
	
	
	static int sumOfSquare(int k){
		int sum=0;
		int b=1;
		for(int a=1;a<=k;a++){
			b=(a*a);
			sum+=b;
		}
		
		return sum;
		
	}
	
	static int squareOfSum(int k){
		int sum=0;
		
		for(int a=1;a<=k;a++){
			
			sum+=a;
		}
		
		return (sum*sum);
		
	}
	
	static int add(int k){
		int ans =0;
		ans=(squareOfSum(k)-sumOfSquare(k));
		return ans;
		
	}

	public static void main(String[] args) {
		System.out.println(add(100));

	}

}
