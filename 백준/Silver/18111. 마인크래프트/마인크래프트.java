import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        for (int h = 0; h <= 256; h++) {
            int time = 0;
            int inventory = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = arr[i][j] - h;

                    if (diff > 0) {        
                        time += diff * 2;
                        inventory += diff;
                    } else {              
                        time += -diff;
                        inventory += diff;
                    }
                }
            }

            if (inventory < 0) continue;

            if (time < minTime || (time == minTime && h > height)) {
                minTime = time;
                height = h;
            }
        }

        System.out.println(minTime + " " + height);
    }
}
