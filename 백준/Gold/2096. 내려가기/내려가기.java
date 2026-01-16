import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [][]arr=new int[N][3];

        //입력받기
        for(int i=0;i<N;i++){
            String[]tmp=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(tmp[0]);
            arr[i][1]=Integer.parseInt(tmp[1]);
            arr[i][2]=Integer.parseInt(tmp[2]);
        }

        //최대 dp
        int [][]dpM=new int[N][3];
        //최소 dp
        int [][]dpm=new int[N][3];
        dpM[0][0]=arr[0][0];
        dpM[0][1]=arr[0][1];
        dpM[0][2]=arr[0][2];

        dpm[0][0]=arr[0][0];
        dpm[0][1]=arr[0][1];
        dpm[0][2]=arr[0][2];

        for(int i=1;i<N;i++){
        //최대 계산
            dpM[i][0]=Math.max(arr[i][0]+dpM[i-1][0],arr[i][0]+dpM[i-1][1]);
            dpM[i][1]=Math.max(arr[i][1]+dpM[i-1][0],Math.max(arr[i][1]+dpM[i-1][1],arr[i][1]+dpM[i-1][2]));
            dpM[i][2]=Math.max(arr[i][2]+dpM[i-1][1],arr[i][2]+dpM[i-1][2]);
            //최소계산
            dpm[i][0]=Math.min(arr[i][0]+dpm[i-1][0],arr[i][0]+dpm[i-1][1]);
            dpm[i][1]=Math.min(arr[i][1]+dpm[i-1][0],Math.min(arr[i][1]+dpm[i-1][1],arr[i][1]+dpm[i-1][2]));
            dpm[i][2]=Math.min(arr[i][2]+dpm[i-1][1],arr[i][2]+dpm[i-1][2]);

        }
        int M=Math.max(dpM[N-1][0],Math.max(dpM[N-1][1],dpM[N-1][2]));
        int m=Math.min(dpm[N-1][0],Math.min(dpm[N-1][1],dpm[N-1][2]));
        System.out.println(M+" "+m);

    }
}
