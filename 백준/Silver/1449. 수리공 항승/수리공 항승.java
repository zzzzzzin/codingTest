import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물이 새는 곳의 개수
        int L = Integer.parseInt(st.nextToken()); // 테이프의 길이

        st = new StringTokenizer(br.readLine());
        int[] locations = new int[N];
        for (int i = 0; i < N; i++) {
            locations[i] = Integer.parseInt(st.nextToken());
        }

        // 물이 새는 위치를 오름차순으로 정렬
        Arrays.sort(locations);

        int count = 1; // 사용된 테이프의 개수
        int start = locations[0]; // 테이프를 붙일 시작 위치

        // 물이 새는 위치에 테이프를 붙이기
        for (int i = 1; i < N; i++) {
            if (locations[i] - start <= L - 1) {
                continue; // 테이프로 덮을 수 있는 범위 내에 있는 경우
            } else {
                count++; // 새로운 테이프가 필요한 경우
                start = locations[i]; // 새로운 테이프를 붙일 시작 위치 업데이트
            }
        }

        System.out.println(count);
    }
}
