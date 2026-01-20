import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            a %= 10;

            int exp = b % 4;
            if (exp == 0) exp = 4;

            int result = 1;
            for (int i = 0; i < exp; i++) {
                result = (result * a) % 10;
            }

            if (result == 0) result = 10;
            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}
