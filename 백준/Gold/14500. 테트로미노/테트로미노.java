
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]arr=br.readLine().split(" ");
        int N=Integer.parseInt(arr[0]);
        int M=Integer.parseInt(arr[1]);
        int[][]map=new int[N][M];
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int j=0;
            while(st.hasMoreTokens()){
                map[i][j++]=Integer.parseInt(st.nextToken());
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                // 일자 모양 확인
                if(N-i>=4){
                    int ls=map[i][j]+map[i+1][j]+map[i+2][j]+map[i+3][j];
                    max=Math.max(max,ls);
                }

                if(M-j>=4){
                    int ls=map[i][j]+map[i][j+1]+map[i][j+2]+map[i][j+3];
                    max=Math.max(max,ls);
                }

                //사각형 확인
                if(N-i>=2&&M-j>=2){
                    int ss=map[i][j]+map[i][j+1]+map[i+1][j]+map[i+1][j+1];
                    max=Math.max(max,ss);
                }
                // ㅗ 모양 확인 (4가지)
                if (N - i >= 2 && M - j >= 3) { // ㅗ
                    int t1 = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+1];
                    max = Math.max(max, t1);
                }
                if (N - i >= 3 && M - j >= 2) { // ㅏ
                    int t2 = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j+1];
                    max = Math.max(max, t2);
                }
                if (N - i >= 2 && M - j >= 3) { // ㅜ
                    int t3 = map[i+1][j] + map[i+1][j+1] + map[i+1][j+2] + map[i][j+1];
                    max = Math.max(max, t3);
                }
                if (N - i >= 3 && M - j >= 2) { // ㅓ
                    int t4 = map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i+1][j];
                    max = Math.max(max, t4);
                }

                // L 모양 (정확한 8가지)
                if (N - i >= 3 && M - j >= 2) {
                    max = Math.max(max,
                            map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j+1]); // └
                    max = Math.max(max,
                            map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i+2][j]); // ┘
                }

                if (N - i >= 2 && M - j >= 3) {
                    max = Math.max(max,
                            map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j]); // ┌
                    max = Math.max(max,
                            map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+2]); // ┐
                }

                if (N - i >= 3 && M - j >= 2) {
                    max = Math.max(max,
                            map[i][j] + map[i+1][j] + map[i+2][j] + map[i][j+1]); // ├
                    max = Math.max(max,
                            map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i][j]); // ┤
                }

                if (N - i >= 2 && M - j >= 3) {
                    max = Math.max(max,
                            map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+1][j+2]); // ┬
                    max = Math.max(max,
                            map[i][j+2] + map[i+1][j] + map[i+1][j+1] + map[i+1][j+2]); // ┴
                }
                // Z 모양 확인 (4가지)
                if (N - i >= 2 && M - j >= 3) {
                    max = Math.max(max,
                            map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+1][j+2]);
                    max = Math.max(max,
                            map[i+1][j] + map[i+1][j+1] + map[i][j+1] + map[i][j+2]);
                }
                if (N - i >= 3 && M - j >= 2) {
                    max = Math.max(max,
                            map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+2][j+1]);
                    max = Math.max(max,
                            map[i][j+1] + map[i+1][j+1] + map[i+1][j] + map[i+2][j]);
                }

            }
        }
        System.out.println(max);
    }
}
