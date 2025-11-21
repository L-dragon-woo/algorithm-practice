
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();

        boolean[] visited = new boolean[n + 1];
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        
        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 양방향 그래프 구성
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a); 
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        // 1번 컴퓨터부터 시작
        stack.push(1);
        visited[1] = true;  // 스택에 넣을 때 방문 체크
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;  // 스택에 넣기 전에 방문 체크
                    stack.push(next);
                    count++;  // 감염된 컴퓨터 수 증가
                }
            }
        }
        
        System.out.println(count);
    }
}