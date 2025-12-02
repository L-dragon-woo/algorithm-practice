import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int N;
    static int M;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        visited=new boolean[N+1];

        backtracking(1,0);

    }

    public static void backtracking(int start,int depth){
        if(depth==M){
            System.out.println(sb);
            return;
        }

        for(int i=start;i<=N;i++){
            if(!visited[i]){
                visited[i]=true;
                sb.append(i).append(" ");
                backtracking(i,depth+1);
                visited[i]=false;
                sb.replace(sb.length()-2,sb.length(),"");
            }
        }
    }
}
