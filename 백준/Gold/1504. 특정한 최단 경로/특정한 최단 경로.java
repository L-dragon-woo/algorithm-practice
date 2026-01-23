import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Edge{
        int to, cost;
        Edge(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    static List<Edge>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int E=Integer.parseInt(st.nextToken());

        graph=new ArrayList[N+1];

        for(int i=1;i<=N;i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<E;i++) {
            String[]arr=br.readLine().split(" ");
            int from=Integer.parseInt(arr[0]);
            int to=Integer.parseInt(arr[1]);
            int cost=Integer.parseInt(arr[2]);

            graph[from].add(new Edge(to,cost));
            graph[to].add(new Edge(from,cost));
        }

        st=new StringTokenizer(br.readLine());
        int v1=Integer.parseInt(st.nextToken());
        int v2=Integer.parseInt(st.nextToken());


        int start=1;
        int end=N;

        //1->v1->v2->end
        //1->v2->v1->end

        int INF=1_000_000_000;
        long[] dist=new long[N+1];
        Arrays.fill(dist,INF);
        long fromOnetov1=dijkstra(start,v1,dist);
        Arrays.fill(dist,INF);
        long fromOnetov2=dijkstra(start,v2,dist);
        Arrays.fill(dist,INF);
        long fromv2toend=dijkstra(v2,end,dist);
        Arrays.fill(dist,INF);
        long fromv1toend=dijkstra(v1,end,dist);

        long fromv1tov2=dijkstra(v1,v2,dist);


        if(fromOnetov1+fromv1tov2+fromv2toend<=fromOnetov2+fromv1tov2+fromv1toend){
            if(fromOnetov1==INF||fromv1tov2==INF||fromv2toend==INF) System.out.println(-1);
            else System.out.println(fromOnetov1+fromv1tov2+fromv2toend);
        }else{
            if(fromOnetov2==INF||fromv1tov2==INF||fromv1toend==INF) System.out.println(-1);
            else System.out.println(fromOnetov2+fromv1tov2+fromv1toend);
        }

    }

    public static long dijkstra(int start,int end,long[]dist){
        dist[start]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(
                (a,b)->a[0]-b[0]
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
        return  dist[end];
    }
}
