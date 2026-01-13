import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[][]dp=new long[n][n];
        long[][]triangle=new long[n][n];
        //입력받기
        for(int i=0;i<n;i++){
            String[] arr=br.readLine().split(" ");
            for(int j=0;j<arr.length;j++){
                triangle[i][j]=Integer.parseInt(arr[j]);
            }
        }

        //dp 만들기
        dp[0][0]=triangle[0][0];
        long max=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle[i][j];
                }else if(j==i){
                    dp[i][j]=dp[i-1][j-1]+triangle[i][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j-1]+triangle[i][j],dp[i-1][j]+triangle[i][j]);
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        if(n==1) {
            System.out.println(triangle[0][0]);
        }else {
            System.out.println(max);
        }
    }
}
