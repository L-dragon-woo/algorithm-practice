import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        long[] arr=new long[101];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=2;
        arr[4]=2;
        for(int i=5;i<=100;i++){
            arr[i]=arr[i-1]+arr[i-5];
        }

        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=T;i++){
            sb.append(arr[Integer.parseInt(br.readLine())-1]).append("\n");
        }
        System.out.println(sb);
    }
}
