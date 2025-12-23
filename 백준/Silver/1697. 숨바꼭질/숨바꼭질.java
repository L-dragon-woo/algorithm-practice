import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        int N=Integer.parseInt(arr[0]);
        int K=Integer.parseInt(arr[1]);
        visited=new boolean[2*K+N+1];
        System.out.println(bfs(N,K));
    }

    static int bfs(int N,int K){
        Queue<int[]>q=new LinkedList<>();
        int[] start={N,0};
        q.offer(start);
        int T=0;
        while(!q.isEmpty()){
            int[] noww=q.poll();
            int now=noww[0];//10
            int time=noww[1];//0

            if(now==K)return time;

            if(now<0)continue;

            if(now>=visited.length)continue;

            if(!visited[now]){
                visited[now]=true;
                time++;
                q.offer(new int[]{now-1,time});
                q.offer(new int[]{now+1,time});
                q.offer(new int[]{now*2,time});
            }
            T=time;
        }
        return T;
    }
}
