import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static List<Edge>[] graph;
    static boolean[] visited;
    static int maxDist = 0;
    static int farNode = 1;

    public static void dfs(int node, int dist) {
        visited[node] = true;

        if (dist > maxDist) {
            maxDist = dist;
            farNode = node;
        }

        for (Edge e : graph[node]) {
            if (!visited[e.to]) {
                dfs(e.to, dist + e.cost);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Edge(b, c));
            graph[b].add(new Edge(a, c));
        }

        //임의 노드에서 가장 먼 노드 찾기
        visited = new boolean[n + 1];
        dfs(1, 0);

        // 그 노드에서 다시 DFS
        visited = new boolean[n + 1];
        maxDist = 0;
        dfs(farNode, 0);

        System.out.println(maxDist);
    }
}
