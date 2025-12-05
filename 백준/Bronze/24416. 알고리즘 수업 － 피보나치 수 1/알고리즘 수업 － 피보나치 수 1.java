import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    static int cnt1=0;
    static int cnt2=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        fib(n);
        fib2(n);
        System.out.print(cnt1+" "+cnt2);
    }

    public static int fib(int n){
        if(n==1||n==2){
            cnt1++;
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static int fib2(int n){
        dp=new int[n+1];
        dp[1]=1;dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            cnt2++;
        }
        return dp[n];
    }

}
