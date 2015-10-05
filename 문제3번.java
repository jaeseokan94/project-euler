package projectEuler;

import java.util.Scanner;

public class 문제3번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int k=0;k<num;k++){
		
		int x1,y1,r1,x2,y2,r2;
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		
	
	   	
		double r3 = (double) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
				

				
		//When the two points are on the same spot
				if(r3==0){
					if(r1==r2){
						System.out.println("-1");	
					}
					else{
						System.out.println("0");
					}
				}
			//When the two circles meet at the one point	
				else if(r3==(r1+r2)){
					System.out.println("1");
				}
			//When the two circles don't meet at all	
				else if(r3>(r1+r2)){
					System.out.println("0");
				}
			//When the center of a small circle located in a big circle	
				else if(r3<(r1+r2)){
					if(r3<Math.abs(r2-r1)){
						System.out.println("0");	
						}
					else if(r3==Math.abs(r2-r1)){
						System.out.println("1");		
						}
					else if(r3>Math.abs(r2-r1)) {
						System.out.println("2");			
						}}									
						}		
	}
}