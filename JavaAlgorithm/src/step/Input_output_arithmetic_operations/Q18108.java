package step.Input_output_arithmetic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {
	
	private static int y;
	private static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		y = Integer.parseInt(br.readLine());
		
		result = y - 543;
		
		System.out.println(result);
		
	}
}
