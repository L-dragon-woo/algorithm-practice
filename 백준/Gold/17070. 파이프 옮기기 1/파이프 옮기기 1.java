import java.io.BufferedReader;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][]matrix=new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        HashMap<Integer,Integer>[][]dp=new HashMap[N+1][N+1];//모양, 밸류

        for(int i=0;i<N+1;i++){
            for(int j=0;j<N+1;j++){
                dp[i][j]=new HashMap<>();
            }
        }

        dp[1][1].put(1,1);
        for(int i=1;i<N+1;i++){
            for(int j=2;j<N;j++){
                if(matrix[i-1][j]==1){
                    continue;
                }
                //상

                if(dp[i-1][j].containsKey(2)&&matrix[i-1][j]!=1){
                    dp[i][j].put(2,dp[i-1][j].get(2)
                            +dp[i][j].getOrDefault(2,0));
                }
                if(dp[i-1][j].containsKey(3)&&matrix[i-1][j]!=1){
                    dp[i][j].put(2,dp[i-1][j].get(3)
                    +dp[i][j].getOrDefault(2,0));
                }
                //좌
                if(dp[i][j-1].containsKey(1)&&matrix[i-1][j]!=1){
                    dp[i][j].put(1,dp[i][j-1].get(1)
                    +dp[i][j].getOrDefault(1,0));
                }
                if(dp[i][j-1].containsKey(3)&&matrix[i-1][j]!=1){
                    dp[i][j].put(1,dp[i][j-1].get(3)
                    +dp[i][j].getOrDefault(1,0));
                }
                //좌상
                if(dp[i-1][j-1].containsKey(1)&&matrix[i-1][j]!=1
                &&matrix[i-2][j]!=1&&matrix[i-1][j-1]!=1){
                    dp[i][j].put(3,dp[i-1][j-1].get(1)
                    +dp[i][j].getOrDefault(3,0));
                }
                if(dp[i-1][j-1].containsKey(2)&&matrix[i-1][j]!=1
                        &&matrix[i-2][j]!=1&&matrix[i-1][j-1]!=1){
                    dp[i][j].put(3,dp[i-1][j-1].get(2)
                    +dp[i][j].getOrDefault(3,0));
                }
                if(dp[i-1][j-1].containsKey(3)&&matrix[i-1][j]!=1
                        &&matrix[i-2][j]!=1&&matrix[i-1][j-1]!=1){
                    dp[i][j].put(3,dp[i-1][j-1].get(3)
                    +dp[i][j].getOrDefault(3,0));
                }
            }
        }

        //답
        int sum=dp[N][N-1].getOrDefault(1,0)
                +dp[N][N-1].getOrDefault(2,0)
                +dp[N][N-1].getOrDefault(3,0);
        System.out.println(sum);







    }
}
