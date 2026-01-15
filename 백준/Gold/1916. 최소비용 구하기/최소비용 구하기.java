import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        List<Edge>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] arr = br.readLine().split(" ");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            int cost = Integer.parseInt(arr[2]);

            graph[from].add(new Edge(to, cost));
        }

        String[] arr = br.readLine().split(" ");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        int INF = 1_000_000_000;
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]
        );

        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int now = cur[0];
            int cost = cur[1];

            if (cost > dist[now]) continue;

            for (Edge edge : graph[now]) {
                int next = edge.to;
                int nextCost = cost + edge.cost;

                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.offer(new int[]{next, nextCost});
                }
            }
        }

        System.out.println(dist[end]);
    }
}
