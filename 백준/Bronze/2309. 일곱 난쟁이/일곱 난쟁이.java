import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	private static int[] arr = new int[9];
	private static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					arr[i]=0;
					arr[j]=0;
					Arrays.sort(arr);
		            for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
				}
			}
		}
	}
}
