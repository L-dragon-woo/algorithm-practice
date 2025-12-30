import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static char[][] map;
    static char[][] map1;
    static boolean[][]visited;
    static boolean[][]visited1;
    static Queue<int[]> queue=new LinkedList<>();
    static Queue<int[]> queue1=new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        map=new char[N][N];
        map1=new char[N][N];
        visited=new boolean[N][N];
        visited1=new boolean[N][N];

        for(int i=0;i<N;i++){
            String s=br.readLine();
            for(int j=0;j<N;j++){
                map[i][j]=s.charAt(j);
                map1[i][j]=s.charAt(j);
            }
        }

        int  cnt=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(visited[i][j])continue;
                queue.offer(new int[]{i,j});
                visited[i][j]=true;
                while(!queue.isEmpty()){
                    int[] cur=queue.poll();
                    int x=cur[0];
                    int y=cur[1];
                    char str=map[x][y];

                    if(x-1>=0&&x-1<N&&!visited[x-1][y]&&map[x-1][y]==str) {
                        queue.offer(new int[]{x - 1, y});
                        visited[x - 1][y] = true;
                    }
                    if(x+1>=0&&x+1<N&&!visited[x+1][y]&&map[x+1][y]==str) {
                        queue.offer(new int[]{x + 1, y});
                        visited[x + 1][y] = true;
                    }
                    if(y+1>=0&&y+1<N&&!visited[x][y+1]&&map[x][y+1]==str) {
                        queue.offer(new int[]{x, y + 1});
                        visited[x][y + 1] = true;
                    }
                    if(y-1>=0&&y-1<N&&!visited[x][y-1]&&map[x][y-1]==str) {
                        queue.offer(new int[]{x, y - 1});
                        visited[x][y - 1] = true;
                    }

                }
                cnt++;
            }
        }

        int cnt1=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(visited1[i][j])continue;
                queue1.offer(new int[]{i,j});
                visited1[i][j]=true;
               while(!queue1.isEmpty()){
                    int[] cur=queue1.poll();
                    int x=cur[0];
                    int y=cur[1];
                    char str=map1[x][y];
                    if(str=='G') {
                        str='R';
                    }

                    if(x-1>=0&&x-1<N&&!visited1[x-1][y]) {
                        if (map1[x - 1][y]=='G') map1[x - 1][y] = 'R';
                        if (map1[x-1][y]==str) {
                            queue1.offer(new int[]{x - 1, y});
                            visited1[x - 1][y] = true;
                        }
                    }
                    if(x+1>=0&&x+1<N&&!visited1[x+1][y]) {
                        if (map1[x + 1][y]=='G') map1[x + 1][y] = 'R';
                        if (map1[x+1][y]==str) {
                            queue1.offer(new int[]{x + 1, y});
                            visited1[x + 1][y] = true;
                        }
                    }
                    if(y+1>=0&&y+1<N&&!visited1[x][y+1]) {
                        if (map1[x][y + 1]=='G') map1[x][y + 1] = 'R';
                        if (map1[x][y+1 ]==str) {
                            queue1.offer(new int[]{x, y + 1});
                            visited1[x][y + 1] = true;
                        }
                    }
                    if(y-1>=0&&y-1<N&&!visited1[x][y-1]) {
                        if (map1[x][y - 1]=='G') map1[x][y - 1] = 'R';
                        if (map1[x][y-1]==str) {
                            queue1.offer(new int[]{x, y - 1});
                            visited1[x][y - 1] = true;
                        }
                    }
                }
                cnt1++;
            }
        }
        System.out.println(cnt+" "+cnt1);





    }
}
