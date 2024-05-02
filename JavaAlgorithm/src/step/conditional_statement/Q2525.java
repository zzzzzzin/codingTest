package step.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {

	private static int h; //현재 시, 결과 시
	private static int m; //현재 분, 결과 분
	private static int need; //필요한 시간
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		need = Integer.parseInt(br.readLine());
		
		m += need;
		
		if (m >= 60) {
			if(h + m/60 < 24) {
				h = h + m/60;
			} else {
				h = h + m/60 - 24;
			}
			m = m%60;
		}
		
		System.out.printf("%d %d", h, m);
		
		
		
	}
}
