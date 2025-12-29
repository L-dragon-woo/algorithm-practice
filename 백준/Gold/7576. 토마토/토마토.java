import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<int[]> q=new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]ar=br.readLine().split(" ");
        int M=Integer.parseInt(ar[0]);
        int N=Integer.parseInt(ar[1]);

        String[][]arr=new String[N][M];
        boolean[][]visited=new boolean[N][M];

        boolean all=false;
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                String str=st.nextToken();
                if(str.equals("0"))all=true;
                if(str.equals("1"))q.add(new int[]{i,j});
                arr[i][j] = str;
            }
        }

        int cnt=-1;
        while(!q.isEmpty()){
            int tmp=q.size();
            cnt++;
            for(int i=0;i<tmp;i++){
                int[] cur=q.poll();

                if(cur[0]-1>=0 && cur[0]-1<N && !visited[cur[0]-1][cur[1]] && arr[cur[0]-1][cur[1]].equals("0")){
                    visited[cur[0]-1][cur[1]]=true;
                    q.add(new int[]{cur[0]-1,cur[1]});
                    arr[cur[0]-1][cur[1]]="1";
                }
                if(cur[0]+1>=0&&cur[0]+1<N &&  !visited[cur[0]+1][cur[1]] && arr[cur[0]+1][cur[1]].equals("0")){
                    visited[cur[0]+1][cur[1]]=true;
                    q.add(new int[]{cur[0]+1,cur[1]});
                    arr[cur[0]+1][cur[1]]="1";
                }
                if(cur[1]-1>=0&&cur[1]-1<M && !visited[cur[0]][cur[1]-1] && arr[cur[0]][cur[1]-1].equals("0")){
                    visited[cur[0]][cur[1]-1]=true;
                    q.add(new int[]{cur[0],cur[1]-1});
                    arr[cur[0]][cur[1]-1]="1";

                }
                if(cur[1]+1>=0&&cur[1]+1<M && !visited[cur[0]][cur[1]+1] && arr[cur[0]][cur[1]+1].equals("0")){
                    visited[cur[0]][cur[1]+1]=true;
                    q.add(new int[]{cur[0],cur[1]+1});
                    arr[cur[0]][cur[1]+1]="1";
                }

            }
        }
        if(!all)System.out.println(0);
        else {
            boolean success = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(arr[i][j].equals("0")){
                        System.out.println(-1);
                        success = true;
                        break;
                    }
                }
                if(success)break;
            }
            if(!success)System.out.println(cnt);
        }



    }
}
