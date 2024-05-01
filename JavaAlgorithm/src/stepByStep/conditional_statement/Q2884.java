package stepByStep.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

	private static int h; //설정 전 알람 시
	private static int m; //설정 전 알람 분
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());		
		
		if (m < 45) {
			if (h == 0) h = 24;
			h -= 1;
			m += 15;
		} else m -= 45;
		
		
		System.out.printf("%d %d", h, m);
		
	}
}
