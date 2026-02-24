import java.util.*;

class Solution {

    static class State {
        int fatigue;
        int count;
        boolean[] visited;

        State(int fatigue, int count, boolean[] visited) {
            this.fatigue = fatigue;
            this.count = count;
            this.visited = visited;
        }
    }

    public int solution(int k, int[][] dungeons) {

        int max = 0;
        Stack<State> stack = new Stack<>();

        stack.push(new State(k, 0, new boolean[dungeons.length]));

        while (!stack.isEmpty()) {

            State cur = stack.pop();
            max = Math.max(max, cur.count);

            for (int i = 0; i < dungeons.length; i++) {
                if (!cur.visited[i] && cur.fatigue >= dungeons[i][0]) {

                    boolean[] newVisited = cur.visited.clone();
                    newVisited[i] = true;

                    stack.push(new State(
                            cur.fatigue - dungeons[i][1],
                            cur.count + 1,
                            newVisited
                    ));
                }
            }
        }

        return max;
    }
}
