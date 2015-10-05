package projectEuler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		for(a=1;a<500;a++)for(b=1;b<500;b++)for(c=1;c<500;c++){
			if((Math.pow(a, 2)+Math.pow(b, 2))==(Math.pow(c, 2))&&(a<b)&&
					(b<c)&&((a+b+c)==1000)){
				System.out.println(a*b*c);
			}
			
		}
		
	}

}