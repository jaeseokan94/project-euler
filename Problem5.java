package projectEuler;

public class Problem5 {

	public static void main(String[] args) {
		
		
       int a,n,count;
       count = 0;
      
       
       for(n=20;n<=1000;n++){
       
       if((n%1)%2==0&&(n%2)%2==0&&(n%3)%2==0&&(n%4)%2==0&&
    	  (n%5)%2==0&&(n%6)%2==0&&(n%7)%2==0&&(n%8)%2==0&&
    		   (n%9)%2==0&&(n%10)%2==0){
           System.out.println(n);

    		   }
       }
    
    	
    	
   	  
	
	}
}

/*  for(a=1;a<=20;a++){
if(((n%a)%2)==0){
	  
	  count++;
}


}/*
/* (n%11)%2==0&&(n%12)%2==0&&
    		   (n%13)%2==0&&(n%14)%2==0&&(n%15)%2==0&&(n%16)%2==0&&
    		   (n%17)%2==0&&(n%18)%2==0&&(n%19)%2==0&&(n%20)%2==0) */