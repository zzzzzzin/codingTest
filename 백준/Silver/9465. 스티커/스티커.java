
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N; //테스트 케이스당 스티커의 수
	public static int T; //테스트 케이스의 갯수
	public static int result; //스티커 총합의 최댓값
	public static int[][] value = new int [2][100000]; //각 스티커 점수[위][아래]
	public static int[][] dp = new int[100000][3]; //dp용 메모리제이션
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t=0; t<T; t++) {
			N = Integer.parseInt(br.readLine()); //테이스 케이스 입력
			
			StringTokenizer st;
            for (int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    value[i][j] = Integer.parseInt(st.nextToken());
                }
            }
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<3; j++) {
					dp[i][j] = -1;
				}
			}
			System.out.println(sticker(0,0));
		}
	}



	private static int sticker(int c, int status) {

		if(c == N) return 0;
		if(dp[c][status] != -1) return dp[c][status];
		
		result = sticker(c+1, 0);
		if(status != 1) result = Math.max(result, sticker(c+1, 1) + value[0][c]);
		if(status != 2) result = Math.max(result, sticker(c+1, 2) + value[1][c]);
		
		dp[c][status] = result;

		return result;
	}
}
