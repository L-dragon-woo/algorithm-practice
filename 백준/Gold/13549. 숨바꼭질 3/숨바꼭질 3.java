
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dist = new int[MAX + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> deque = new LinkedList<>();

        dist[N] = 0;
        deque.offerFirst(N);

        while (!deque.isEmpty()) {
            int location = deque.pollFirst();

            if (location == K) {
                System.out.println(dist[location]);
                return;
            }

            // 순간이동 (0초)
            if (location * 2 <= MAX && dist[location * 2] > dist[location]) {
                dist[location * 2] = dist[location];
                deque.offerFirst(location * 2);
            }

            // +1 이동 (1초)
            if (location + 1 <= MAX && dist[location + 1] > dist[location] + 1) {
                dist[location + 1] = dist[location] + 1;
                deque.offerLast(location + 1);
            }

            // -1 이동 (1초)
            if (location - 1 >= 0 && dist[location - 1] > dist[location] + 1) {
                dist[location - 1] = dist[location] + 1;
                deque.offerLast(location - 1);
            }
        }
    }
}
