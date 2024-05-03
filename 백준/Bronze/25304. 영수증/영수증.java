import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int x; //영수증의 총 금액
	private static int n; //영주증의 물건 종류 갯수
	private static int a; //물건 가격
	private static int b; //물건 갯수
	private static int sum = 0; //실제 총 금액

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		x = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sum = sum + a * b;
		}
		
		if (sum == x) System.out.println("Yes");
		else System.out.println("No");
		
		
	}
	
}
