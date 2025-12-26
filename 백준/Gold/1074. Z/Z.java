import java.io.*;
import java.util.*;

public class Main {
    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        solve(N, r, c);
        System.out.println(result);
    }

    static void solve(int n, int r, int c) {
        if (n == 0) return;

        int half = 1 << (n - 1);
        int area = half * half;

        // 1사분면
        if (r < half && c < half) {
            solve(n - 1, r, c);
        }
        // 2사분면
        else if (r < half && c >= half) {
            result += area;
            solve(n - 1, r, c - half);
        }
        // 3사분면
        else if (r >= half && c < half) {
            result += area * 2;
            solve(n - 1, r - half, c);
        }
        // 4사분면
        else {
            result += area * 3;
            solve(n - 1, r - half, c - half);
        }
    }
}
