package stepByStep.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9498 {
	
	private static int score;
	private static String result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		score = Integer.parseInt(br.readLine()); 

		if (score < 60) result = "F";
		else if (score < 70) result = "D";
		else if (score < 80) result = "C";
		else if (score < 90) result = "B";
		else if (score <= 100) result = "A";
		
		System.out.println(result);
	}

}
