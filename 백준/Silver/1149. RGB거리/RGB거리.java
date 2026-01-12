import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[][] dp=new int[N+1][3];
        for(int i=1;i<N+1;i++){
            String[] str=br.readLine().split(" ");
            int R=Integer.parseInt(str[0]);
            int G=Integer.parseInt(str[1]);
            int B=Integer.parseInt(str[2]);
            dp[i][0]=dp[i-1][1]+R>dp[i-1][2]+R?dp[i-1][2]+R:dp[i-1][1]+R;
            dp[i][1]=dp[i-1][0]+G>dp[i-1][2]+G?dp[i-1][2]+G:dp[i-1][0]+G;
            dp[i][2]=dp[i-1][1]+B>dp[i-1][0]+B?dp[i-1][0]+B:dp[i-1][1]+B;
        }
        System.out.println(Math.min(dp[N][0],Math.min(dp[N][1],dp[N][2])));
    }
}
