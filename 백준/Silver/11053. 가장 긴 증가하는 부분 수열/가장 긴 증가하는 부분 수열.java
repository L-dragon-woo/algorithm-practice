import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int []arr=new int[N];
        int []dp=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(dp,1);

        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){//arr[i]를 최댓값으로 갖는 값
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        Arrays.stream(dp).max().ifPresent(System.out::println);
    }

}
