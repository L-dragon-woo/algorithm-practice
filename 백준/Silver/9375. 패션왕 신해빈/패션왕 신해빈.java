import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();               // 옷 이름 (사용 안 함)
                String type = st.nextToken(); // 옷 종류

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;

            for (int count : map.values()) {
                answer *= (count + 1);
            }

            answer -= 1;  // 아무것도 안 입은 경우 제외
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}
