import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Edge{
        int to,cost;
        public Edge(int to,int cost){
            this.to=to;
            this.cost=cost;
        }
    }

    static List<Edge>[]graph;
    static long[]distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int V=Integer.parseInt(st.nextToken());
        int E=Integer.parseInt(st.nextToken());
        graph= new ArrayList[V+1];

        for(int i=1;i<=V;i++) graph[i]=new ArrayList<Edge>();

        int start=Integer.parseInt(br.readLine());

        for(int i=1;i<=E;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            graph[from].add(new Edge(to,cost));

        }


        int INF=Integer.MAX_VALUE;
        distance=new long[V+1];
        Arrays.fill(distance,INF);
        distance[start]=0;

        dijkstra(start,V,distance);

        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=V;i++){
           if(distance[i]!=INF){
               sb.append(distance[i]).append("\n");
           }else{
               sb.append("INF\n");
           }
        }

        System.out.println(sb);
    }

    public static void dijkstra(int start,int end,long[]dist){
        dist[start]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(
                (a,b)->a[1]-b[1]
        );
        pq.offer(new int[]{start,0});
        while(!pq.isEmpty()){
            int[]cur=pq.poll();
            int now=cur[0];
            int cost=cur[1];

            if(cost>dist[now])continue;

            for(Edge edge:graph[now]) {
                int next=edge.to;
                int nextCost=cost+edge.cost;

                if(dist[next]>nextCost){
                    dist[next]=nextCost;
                    pq.offer(new int[]{next,nextCost});
                }
            }
        }
    }
}
