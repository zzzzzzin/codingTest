package bruteForceSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Q1912 {
	public static int n; //입력할 정수의 갯수
	public static int max = 0; //결과
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		
		Random r = new Random();
		
		n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			System.out.print(r.nextInt(2001)-1000+" ");
			list.add(r.nextInt(2001)-1000);
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				
			}
		}
		
	}
}
