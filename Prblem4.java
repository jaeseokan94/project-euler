package projectEuler;

public class Prblem4 {


	
	public static void check1(int k){
		
		int a = k/10000;
		int b = (k/1000)%10;
		int c = (k/10)%10; 
		int d = (k/1)%10; 
		
	
	
		
		if((a==d)&(b==c)){
		System.out.println(k);
		}			}
		
	public static void check2(int k){
		int a = (k/100000)%10;
		int b = (k/10000)%10;
		 int c = (k/1000)%10;
		int d = (k/100)%10;
		int e = (k/10)%10; 
		 int f = (k/1)%10; 
	
		
		if((a==f)&(b==e)&(c==d)&(a==9)){
			
		System.out.println(k);
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=999;i>=100;i--){
			for(int j=999;j>100;j--){
				
				int k;
				k=i*j;
				
		if(10000<=k&&k<100000) 				
				;
		else if(100000<=k&&k<1000000)
			check2(k);
		else
			System.out.println("Out of range");
			}					
		}	
	}
}