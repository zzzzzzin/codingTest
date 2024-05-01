package stepByStep.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {
	
	private static int year;
	private static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		year = Integer.parseInt(br.readLine());
		
		if( (year%4 == 0) && ((year%100 != 0) || (year%400 == 0))) result = 1;
		else result = 0;
		
		System.out.println(result);
	}

}
