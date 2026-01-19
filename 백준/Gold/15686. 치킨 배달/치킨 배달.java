import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer[]> houses = new ArrayList<>();
    static List<Integer[]> chickens = new ArrayList<>();
    static List<Integer[]> tmpChickens = new LinkedList<>();
    static int N;
    static int M;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i<M; i++) {
            tmpChickens.add(new Integer[]{});
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 1) {
                    houses.add(new Integer[]{i, j});
                }
                if (n == 2) {
                    chickens.add(new Integer[]{i, j});
                }
            }
        }

        getMinimumChickens(0, 0);

        System.out.println(min);
    }

    static void getMinimumChickens(int idx, int cnt) {
        if (cnt == M) {
            int minDist = 0;
            for (int i = 0; i < houses.size(); i++) {
                Integer[] house = houses.get(i);
                int dist = Integer.MAX_VALUE;
                for (int j = 0; j < tmpChickens.size(); j++) {
                    Integer[] chicken = tmpChickens.get(j);
                    int hToC = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                    dist = Math.min(dist, hToC);
                }
                minDist += dist;
            }

            if (min > minDist) {
                min = minDist;
            }
            return;
        }

        for (int i = idx; i < chickens.size(); i++) {
            tmpChickens.set(cnt, chickens.get(i));
            getMinimumChickens(i + 1, cnt + 1);
        }
    }
}
