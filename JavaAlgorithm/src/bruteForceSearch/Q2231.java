package bruteForceSearch;
import java.util.Scanner;

public class Q2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();	//분해합
		int result = 0;			//N의 가장 작은 생성자
		for(int i=0; i<N; i++) {
			int number = i;	//0부터 시작하는 생성자 후보들
			int sum = 0;	//생성자의 자릿수의 합 
			
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}//while
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}//for
		System.out.print(result);
	}
}




