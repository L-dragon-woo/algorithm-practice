import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] map=new int[101];
    static boolean[]visited=new boolean[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]arr=br.readLine().split(" ");
        int N=Integer.parseInt(arr[0]);
        int M=Integer.parseInt(arr[1]);

        //사다리, 뱀 입력받기
        for(int i=0;i<N+M;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int k=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            map[k]=v;
        }


        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{1,0});//1부터 시작
        while(!q.isEmpty()){
            int s[]=q.poll();
            int cur=s[0];
            int cnt=s[1];
            if(cur==100){
                System.out.println(cnt);
                break;
            }

            if(cur+1<=100&&!visited[cur+1]){
                if(map[cur+1]==0){
                    q.offer(new int[]{cur+1,cnt+1});
                    visited[cur+1]=true;
                }else{
                    q.offer(new int[]{map[cur+1],cnt+1});
                    visited[map[cur+1]]=true;
                }
            }
            if(cur+2<=100&&!visited[cur+2]){
                if(map[cur+2]==0){
                    q.offer(new int[]{cur+2,cnt+1});
                    visited[cur+2]=true;
                }else{
                    q.offer(new int[]{map[cur+2],cnt+1});
                    visited[map[cur+2]]=true;
                }
            }
            if(cur+3<=100&&!visited[cur+3]){
                if(map[cur+3]==0){
                    q.offer(new int[]{cur+3,cnt+1});
                    visited[map[cur+2]]=true;
                }else{
                    q.offer(new int[]{map[cur+3],cnt+1});
                    visited[map[cur+3]]=true;
                }
            }
            if(cur+4<=100&&!visited[cur+4]){
                if(map[cur+4]==0){
                    q.offer(new int[]{cur+4,cnt+1});
                    visited[cur+4]=true;
                }else{
                    q.offer(new int[]{map[cur+4],cnt+1});
                    visited[map[cur+4]]=true;
                }
            }if(cur+5<=100&&!visited[cur+5]){
                if(map[cur+5]==0){
                    q.offer(new  int[]{cur+5,cnt+1});
                    visited[cur+5]=true;
                }else{
                    q.offer(new int[]{map[cur+5],cnt+1});
                    visited[map[cur+5]]=true;
                }
            }if(cur+6<=100&&!visited[cur+6]){
                if(map[cur+6]==0){
                    q.offer(new  int[]{cur+6,cnt+1});
                    visited[cur+6]=true;
                }else{
                    q.offer(new  int[]{map[cur+6],cnt+1});
                    visited[map[cur+6]]=true;
                }
            }

        }


    }
}
