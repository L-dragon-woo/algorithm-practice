import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int k = L; k <= 100; k++) {
            int tmp = N - k * (k - 1) / 2;
            if (tmp < 0) break;

            if (tmp % k == 0) {
                int x = tmp / k;
                if (x >= 0) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < k; i++) {
                        sb.append(x + i).append(" ");
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
