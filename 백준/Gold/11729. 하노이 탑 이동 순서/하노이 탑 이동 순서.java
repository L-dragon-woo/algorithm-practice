
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb.append((1 << n) - 1).append("\n");
        hanoi(n, 1, 3, 2);

        System.out.print(sb);
    }

//최저 수를 정해놓고 하는 방식임
    public static void hanoi(int n, int from, int to, int via) {
        //종료 조건
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        // 1) n-1개를 from → via 로 옮기기
        hanoi(n - 1, from, via, to);

        // 2) 가장 큰 원판 1개를 from → to 로 이동
        sb.append(from).append(" ").append(to).append("\n");

        // 3) n-1개를 via → to 로 옮기기
        hanoi(n - 1, via, to, from);
    }
}
