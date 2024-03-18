package bruteForceSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Q1912 {
	public static int n; //입력할 정수의 갯수
	public static int maxSum = 0; //최댓값
	public static int currentSum = 0; //연속하는 수의 합
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n= Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		Random r = new Random();
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		for (int i=1; i<n; i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			
			maxSum = Math.max(maxSum, currentSum); 
		}
		System.out.println(maxSum);
	}
}
