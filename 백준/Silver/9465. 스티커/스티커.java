import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int t=0;t<T;t++) {
            int N=Integer.parseInt(br.readLine());
            int[][]arr=new int[2][N];
            int[][]dp=new int[2][N];
            //입력받기
            for (int i = 0; i < 2; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(str[j]);
                }
            }
            if(N>2) {
                //초기값
                dp[0][0] = arr[0][0];
                dp[1][0] = arr[1][0];
                dp[0][1]=  arr[0][1]+arr[1][0];
                dp[1][1]=  arr[1][1]+arr[0][0];

                //
                for (int j = 2; j < N; j++) {
                    dp[0][j] = Math.max(dp[1][j - 1] + arr[0][j], dp[1][j - 2] + arr[0][j]);
                    dp[1][j] = Math.max(dp[0][j - 1] + arr[1][j], dp[0][j - 2] + arr[1][j]);
                }
                sb.append(Math.max(dp[0][N-1],dp[1][N-1])).append("\n");
            }else{
                //1,2
                if(N==1){
                    sb.append(Math.max(arr[0][0],arr[1][0])).append("\n");
                }else if(N==2){
                    sb.append(Math.max(arr[0][0]+arr[1][1],arr[0][1]+arr[1][0])).append("\n");
                }
            }

        }

        System.out.println(sb);
    }
}
