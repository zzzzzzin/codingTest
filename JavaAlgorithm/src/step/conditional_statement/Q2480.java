package step.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {
	
	private static int a;
	private static int b;
	private static int c;
	private static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		if (a==b && b==c) result = 10000+a*1000;
		else if (a!=b && a!=c && b!=c) result = max(a,b,c)*100;
		else {
			if (b==c) result = 1000+b*100;
			else result = 1000+a*100;
		} 
		
		
		System.out.println(result);
	}

	private static int max(int a, int b, int c) {
		int maxNum = -1;
		int temp = -1;
		int[] arr = {a, b, c};
		
		for (int i=0; i<3; i++) {
			if(temp < arr[i]) temp = arr[i];
		}
		
		maxNum = temp;
		
		return maxNum;
	}

}
