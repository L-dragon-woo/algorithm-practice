import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][]arr=new int[15][15];
        //0대입
        int tmp=0;
        for(int i=0;i<15;i++){
            arr[i][0]=0;
            arr[0][i]=tmp;
            tmp++;
        }

        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<T;i++){
            int row=Integer.parseInt(br.readLine());
            int col=Integer.parseInt(br.readLine());
            sb.append(dp(arr,row,col)+"\n");
        }

        System.out.println(sb);

    }

    public static int dp(int[][]arr,int row,int col){
        if(row==0||col==0){
            return arr[row][col];
        }
        return dp(arr,row-1,col)+dp(arr,row,col-1);
    }
}
