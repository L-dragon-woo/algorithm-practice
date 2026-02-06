import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        List<Integer> list = new ArrayList<>();

        int[] dr = {-1, 1, 0, 0}; // 상하좌우
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    Stack<int[]> stack = new Stack<>();
                    visited[i][j] = true;
                    stack.push(new int[]{i, j});

                    int sum = 0;

                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        int r = cur[0];
                        int c = cur[1];

                        sum += maps[r].charAt(c) - '0';

                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                                if (!visited[nr][nc] && maps[nr].charAt(nc) != 'X') {
                                    visited[nr][nc] = true;
                                    stack.push(new int[]{nr, nc});
                                }
                            }
                        }
                    }
                    list.add(sum);
                }
            }
        }

        if (list.isEmpty()) return new int[]{-1};

        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
