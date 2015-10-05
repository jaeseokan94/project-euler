package projectEuler;

import java.util.Scanner;


public class 문제3번_2 {
 
    public static void main(String[] args) {
         
        Scanner input=new Scanner(System.in);
         
        int x1,y1,r1,x2,y2,r2;
        int testCase;
        int[] result;
        testCase=input.nextInt();
        result=new int[testCase];
         
        for(int i=0;i<testCase;i++){
            x1=input.nextInt();
            y1=input.nextInt();
            r1=input.nextInt();
            x2=input.nextInt();
            y2=input.nextInt();
            r2=input.nextInt();
             
            result[i]=cal(x1,y1,r1,x2,y2,r2);
        }
        for(int i=0;i<testCase;i++){
            System.out.println(result[i]);
        }
         
    }
    public static int cal(int x1,int y1,int r1,int x2,int y2,int r2){
    	
double r3 = (double) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		

		
		if(r3==0){
			if(r1==r2){
				return -1;
			}
			else{
				return 0;
			}
		}
		
		else if(r3==(r1+r2)){
			return 1;
		}
		else if(r3>(r1+r2)){
			return 0;
		}
		else if(r3<(r1+r2)){
			if(r3<Math.abs(r2-r1)){
				return 0;
			}
			else if(r3==Math.abs(r2-r1)){
				return 1;
			}
			else if(r3>Math.abs(r2-r1)) {
				return 2;
			}}
		
			
	return 0;	}
    
		
}