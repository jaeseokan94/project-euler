package projectEuler;

import java.awt.List;
import java.util.ArrayList;

public class Problem1 {
	
public static int repeat(){
		
		int[] sumOfRepeat = new int[1000];
		int sum = 0;

		for(int i=15;i<1000;i=i+15){
			sum += i;
			sumOfRepeat[i]=sum;			
		}		
		return sum;
			
	}	
	
public static int five(){
		
		int[] sumOfFive = new int[1000];
		int sum = 0;

		for(int i=5;i<1000;i=i+5){
			sum += i;
			sumOfFive[i]=sum;			
		}		
		return sum;
			
	}
	
	public static int three(){
		
		//int[] sumOfThree = new int[1000];
		int sum = 0;

		for(int i=3;i<1000;i=i+3){
			sum += i;
			//sumOfThree[i]=sum;			
		}		
		return sum;
			
	}
	
	public static void answer(){
		int answer = 0;
		answer = (three()+five())-repeat();
		
		System.out.println(answer);
		
	}
	
	public static void answer2(){
		
		int sum = 0;
		
		for(int i=1; i<1000;i++){
			if(i%3==0||i%5==0){
				sum = sum+i;
			}
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		answer();
		answer2();

	}

}
