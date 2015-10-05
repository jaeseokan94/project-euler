package projectEuler;

import java.util.Scanner;

public class BaekJoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		String courseName = kb.nextLine();
		String scoreLine = kb.nextLine();

		// courseName and scoreLine now become the parameters to you method...

		// You could then use another scanner to break the line down...
		Scanner scoreLineScanner = new Scanner(scoreLine);

		while (scoreLineScanner.hasNextInt()) {
		    int score = scoreLineScanner.nextInt();
		    if (score != -1) {
		        // Calculate other values...
		    } else {
		        break;
		    }
		}

	}}
