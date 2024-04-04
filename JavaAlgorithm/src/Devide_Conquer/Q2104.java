package Devide_Conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2104 {
	
	public static int N; //배열의 크기
	public static int i; //점수 범위 시작 인덱스
	public static int j; //점수 범위 끝 인덱스
	public static int result; //부분배열의 최댓값
	
	public static int max(int[] list) {
		int max = 0;
		int index = list.length;
		for(int k=0; k<list.length; k++) {
			
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		int[] list = new int [N];

		StringTokenizer st = new StringTokenizer(br.readLine()); 
		for (int i=0; i<N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(max(list));
		
	}

}
