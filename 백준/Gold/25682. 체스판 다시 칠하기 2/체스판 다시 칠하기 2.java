import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

      
        int[][] preB = new int[N + 1][M + 1];  
        int[][] preW = new int[N + 1][M + 1];  

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

              
                char expectB = ((i + j) % 2 == 0) ? 'B' : 'W';
                char expectW = ((i + j) % 2 == 0) ? 'W' : 'B';

                int diffB = (board[i][j] != expectB ? 1 : 0);
                int diffW = (board[i][j] != expectW ? 1 : 0);

          
                preB[i + 1][j + 1] = diffB
                        + preB[i][j + 1]
                        + preB[i + 1][j]
                        - preB[i][j];

                preW[i + 1][j + 1] = diffW
                        + preW[i][j + 1]
                        + preW[i + 1][j]
                        - preW[i][j];
            }
        }

        int answer = Integer.MAX_VALUE;

        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {

                int x1 = i - K;
                int y1 = j - K;

                int costB = preB[i][j]
                        - preB[x1][j]
                        - preB[i][y1]
                        + preB[x1][y1];

                int costW = preW[i][j]
                        - preW[x1][j]
                        - preW[i][y1]
                        + preW[x1][y1];

                answer = Math.min(answer, Math.min(costB, costW));
            }
        }

        System.out.println(answer);
    }
}
