
package projectEuler;

public class Problem12 {
	
	public static void main(String[] args) {
		long num,i,j,count;
		num=0;
		long startTime = System.nanoTime();    
		
		for(i=1;i<10000;i++){
			num=num+i;
			count=0;
			for(j=1;j<=num;j++){				
				if((num%j)==0){
					count++;					
				}
			}
				if(count>500){
					System.out.println(num);
				}
	} 
		long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime/1000);
	}	
}
//57177120
//171531360
//2344261920