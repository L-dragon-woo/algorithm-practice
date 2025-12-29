import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static String[][][]arr;
    static boolean[][][]visited;
    static Queue<int[]> q=new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int M=Integer.parseInt(a[0]);
        int N=Integer.parseInt(a[1]);
        int H=Integer.parseInt(a[2]);
        arr=new String[H][N][M];
        visited=new boolean[H][N][M];

        //1: 익은 토마토, 0은 익지 않은 토마토 -1: 빈 공간
        //배열 입력
        boolean all=false;

        for(int i=0;i<H;i++){
            for(int j=0;j<N;j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    String str=st.nextToken();
                    if(str.equals("0"))all=true;
                    if(str.equals("1"))q.add(new int[]{i,j,k});
                    arr[i][j][k] = str;
                }
            }
        }

        int cnt=-1;
        while(!q.isEmpty()){
            int tmp=q.size();
            cnt++;
            for(int i=0;i<tmp;i++){
                int[] now=q.poll();

                //성공
                if(
                        now[0]+1>=0 && now[0]+1<H&&!visited[now[0]+1][now[1]][now[2]]
                        &&arr[now[0]+1][now[1]][now[2]].equals("0")) {
                    q.add(new int[]{now[0] + 1, now[1], now[2]});
                    visited[now[0]+1][now[1]][now[2]]=true;
                    arr[now[0]+1][now[1]][now[2]] = "1";
                }

                //성공
                if(
                        now[0]-1>=0 && now[0]-1<H&&!visited[now[0]-1][now[1]][now[2]]
                        &&arr[now[0]-1][now[1]][now[2]].equals("0")) {
                    q.add(new int[]{now[0] - 1, now[1], now[2]});
                    visited[now[0]-1][now[1]][now[2]]=true;
                    arr[now[0]-1][now[1]][now[2]] = "1";
                }
                //성공
                if(
                        now[1]+1>=0 && now[1]+1<N &&!visited[now[0]][now[1]+1][now[2]]
                        &&arr[now[0]][now[1]+1][now[2]].equals("0")) {
                    q.add(new int[]{now[0], now[1] + 1, now[2]});
                    visited[now[0]][now[1]+1][now[2]]=true;
                    arr[now[0]][now[1]+1][now[2]] = "1";
                }
                //성공
                if(
                        now[1]-1>=0 && now[1]-1<N && !visited[now[0]][now[1]-1][now[2]]
                        &&arr[now[0]][now[1]-1][now[2]].equals("0")) {
                    q.add(new int[]{now[0], now[1] - 1, now[2]});
                    visited[now[0]][now[1]-1][now[2]]=true;
                    arr[now[0]][now[1]-1][now[2]] = "1";
                }

                if(
                        now[2]+1>=0 && now[2]+1<M && !visited[now[0]][now[1]][now[2]+1]
                        &&arr[now[0]][now[1]][now[2]+1].equals("0")) {
                    q.add(new int[]{now[0], now[1], now[2] + 1});
                    visited[now[0]][now[1]][now[2]+1]=true;
                    arr[now[0]][now[1]][now[2]+1] = "1";
                }

                if(
                        now[2]-1>=0 && now[2]-1<M && !visited[now[0]][now[1]][now[2]-1]
                        &&arr[now[0]][now[1]][now[2]-1].equals("0")) {
                    q.add(new int[]{now[0], now[1], now[2] - 1});
                    visited[now[0]][now[1]][now[2] - 1] = true;
                    arr[now[0]][now[1]][now[2] - 1] = "1";
                }
            }
        }

        if(!all)System.out.println(0);
        else {
            boolean success = false;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < M; k++) {
                        if (arr[i][j][k].equals("0")) {
                            System.out.println(-1);
                            success = true;
                            break;
                        }
                    }
                    if (success) break;
                }
                if (success) break;
            }
            if (!success) System.out.println(cnt);
        }
    }
}
