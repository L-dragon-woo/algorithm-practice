
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] arr = new int[26][s.length()];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';

            if (i > 0) {
                for (int j = 0; j < 26; j++) {
                    arr[j][i] = arr[j][i - 1];
                }
            }

            arr[num][i]++;
        }

        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int idx = a - 'a';

            if (l == 0) {
                sb.append(arr[idx][r]).append("\n");
            } else {
                sb.append(arr[idx][r] - arr[idx][l - 1]).append("\n");
            }
        }

        System.out.print(sb);
    }
}
