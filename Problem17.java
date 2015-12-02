package projectEuler;

/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */



public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oneTonine = 3+3+5+4+3+5+5+4;
		int tenTonineteen = 3+6+5+8+8+7+7+9+8+8;
		int twentyTonintynine = (6+6+5+5+5+7+6+6)*(oneTonine+1);
		
		int set = oneTonine+tenTonineteen+twentyTonintynine; //1-99
		
		int hundredand = 10;
		
		int hundredTo999 =  (oneTonine)*(hundredand)*(set)+(oneTonine+(7*9));
		int onethousand = 11; 
		
		int ans = set+hundredTo999+onethousand;
		
		
		System.out.println(ans);

	}

}

/* one:3 two:3 three:5 four:4 five:4 six:3 seven:5 eight:5 nine:4 
 * ten:3 eleven : 6 twelve :5 thirteen : 8 fourteen : 8 fifteen :7 sixteen:7 seventeen:9 eighteen:8 nineteen:8  
 * twenty:6 twenty  + one to nine 
 *  thirty: 6
 *  forty :5
 *  fifty :5
 *  sixty :5
 *  seventy:7
 *  eighty:6
 *  ninety:6
 * 
 * hundred + and :7
 * two - hundred - and
 * three-
 * four-
 * five-
 * six-
 * seven-
 * eight-
 * nine-
 * one thousand - 11
 */
