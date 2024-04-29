package stepByStep.Input_output_arithmetic_operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10869 {

	private static int a;
	private static int b;
	private static int[] list= new int[5];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		list[0] = a + b;
		list[1] = a - b;
		list[2] = a * b;
		list[3] = a / b;
		list[4] = a % b;

		for(int i=0; i<5; i++) {
			System.out.println(list[i]);
		}

	}

}

