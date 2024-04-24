package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2294 {
	
	private static int n; //동전의 개수
	private static int k; //동전의 총 합
	private static int result; //최소 동전 개수
	private static int no = 100000; //동전의 최대 가치
	private static int[] cost; //각 동전의 가치
	private static int[][] dp; //메모이제이션

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		cost = new int[n];
		for(int i=0; i<n; i++) {
			cost[i] = Integer.parseInt(br.readLine());
		}
		
		dp = new int[n][k];
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=k; j++) {
				dp[i][j] = -1;
			}
		}
		
		result = coin(0, k);

		if (result == no) result = -1;
		
		else System.out.println(result); 
		
	}

	private static int coin(int cnt, int sum) {
		
		if(cnt == n) return (sum == 0 ? 0 : no);
		if(dp[cnt][sum] != -1) return dp[cnt][sum];
		
		int result = coin(cnt+1, sum);
		
		if(k >= cost[cnt]) result = Math.min(result, coin(cnt, sum-cost[cnt]) + 1);
		
		dp[cnt][sum] = result;
		
		return result;

	}

}











