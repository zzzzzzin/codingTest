package Devide_Conquer;
import java.util.Scanner;

public class Q2104 {

    static long[] A;

    static long func(int s, int e) {
        if (s == e) {
            return A[s] * A[s];
        }
        int mid = (s + e) / 2;
        long result = 0;
        result = Math.max(func(s, mid), func(mid + 1, e));
        long V = A[mid];
        long min = A[mid];
        int l = mid;
        int r = mid;
        while (l > s || r < e) {
            long p = l > s ? A[l - 1] : -1; // 왼쪽으로 갔을때 값
            long q = r < e ? A[r + 1] : -1; // 오른쪽으로 갔을때 값
            if (p >= q) { // 왼쪽으로 감
                V = V + p;
                if (min > p && p != -1) {
                    min = p;
                }
                l--;
            } else { // 오른쪽으로 감
                V = V + q;
                if (min > q && q != -1) {
                    min = q;
                }
                r++;
            }
            result = Math.max(result, V * min);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        System.out.println(func(0, N - 1));
    }
}
