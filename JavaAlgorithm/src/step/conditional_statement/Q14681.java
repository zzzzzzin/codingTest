package step.conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
	
	private static int x;
	private static int y;
	private static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		if (x>0 && y>0) result = 1;
		else if (x<0 && y>0) result = 2;
		else if (x<0 && y<0) result = 3;
		else result = 4;
		
		System.out.println(result);
	}

}
