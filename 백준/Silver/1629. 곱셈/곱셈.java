import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long a; //곱셈 대상
	public static long b; //곱셈 횟수
	public static long c; //a^b를 나누는 수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		System.out.println(cal(a, b, c));
		
	}
	public static long cal(long a, long b, long c) {
		
		if (b == 1) return a%c;
		
		long temp = cal(a, b/2, c); //지수(b)의 절반 > 분할
		
		if (b%2 == 1) {
			return (temp * temp % c) * a % c; //모듈의 성질 > (a * b) % C = ((a % C)*(b % C)) % C
			
		}
		
		return temp * temp % c;
	}
}
