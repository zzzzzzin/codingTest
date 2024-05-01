package stepByStep.Input_output_arithmetic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2588 {
	
	private static int a;
	private static int b;
	private static int three;
	private static int four;
	private static int five;
	private static int six;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		three = a * (b%10);
		four = a * (b%100-b%10) / 10;
		five = a * (b/100);
		six = three + four*10 + five*100;
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		
		
		
	}

}
