import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static String[][]arr;
    static int[][]dist;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new String[N][N];
        dist=new int[N][N];

        for(int i=0;i<N;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }

        for(int i=0;i<N;i++){
            arr[i]=br.readLine().split(" ");
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr[i][j].equals("1")){
                    dist[i][j]=1;
                }
            }
        }

        //N-1번 확인해야함
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(dist[k][i]==1&&dist[i][j]==1){
                        dist[k][j]=1;
                    }
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int[] arr:dist){
            for(int a:arr){
                if(a==Integer.MAX_VALUE)sb.append("0 ");
                else if(a==1) sb.append("1 ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
