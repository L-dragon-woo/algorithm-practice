import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static List<Integer>[] graph;
    static Queue<Integer> queue=new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 그래프 초기화 (1번 사람부터 사용)
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 진실 아는 사람 입력
        st = new StringTokenizer(br.readLine());
        int truthCnt = Integer.parseInt(st.nextToken());

        HashSet<Integer> trueKnow = new HashSet<>();

        for (int i = 0; i < truthCnt; i++) {
            int person = Integer.parseInt(st.nextToken());
            trueKnow.add(person);
            queue.offer(person);
        }

        int[][]party=new int[M][50];
        // 파티 입력  양방향 그래프 연결
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            for (int j = 0; j < cnt; j++) {
                party[i][j] = Integer.parseInt(st.nextToken());
            }

            // 같은 파티 사람들끼리 전부 연결
            for (int a = 0; a < cnt; a++) {
                for (int b = a + 1; b < cnt; b++) {
                    int u = party[i][a];
                    int v = party[i][b];
                    graph[u].add(v);
                    graph[v].add(u);
                }
            }
        }


        //BFS로 진실을 아는 사람 찾기
        while(!queue.isEmpty()) {
            int cur= queue.poll();
            for(int i: graph[cur]) {
                if(i==0){
                    break;
                }
                if(!trueKnow.contains(i)) {
                    trueKnow.add(i);
                    queue.offer(i);
                }
            }
        }

        //이제 파티로 찾기
        int num=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<50;j++){
                int a=party[i][j];
                if(a==0){
                    num++;
                    break;
                }else{
                    if(trueKnow.contains(a)){
                        break;
                    }
                }
            }
        }
        System.out.println(num);

    }
}
