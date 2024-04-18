package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] assignments = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            assignments[i][0] = Integer.parseInt(st.nextToken());
            assignments[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(assignments, (a, b) -> Integer.compare(b[1], a[1]));

        boolean[] days = new boolean[1001]; // 마감일별 과제 여부를 저장하는 배열
        int totalScore = 0; // 총 점수

        for (int[] assignment : assignments) {
            for (int day = assignment[0]; day >= 1; day--) {
                if (!days[day]) {
                    days[day] = true;
                    totalScore += assignment[1];
                    break;
                }
            }
        }

        System.out.println(totalScore);
    }
}